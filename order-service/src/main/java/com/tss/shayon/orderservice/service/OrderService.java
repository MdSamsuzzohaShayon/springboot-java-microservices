package com.tss.shayon.orderservice.service;

import com.tss.shayon.orderservice.dto.InventoryResponse;
import com.tss.shayon.orderservice.dto.OrderLineItemsDto;
import com.tss.shayon.orderservice.dto.OrderRequest;
import com.tss.shayon.orderservice.model.Order;
import com.tss.shayon.orderservice.model.OrderLineItems;
import com.tss.shayon.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/*
 * ===========================================================
 * SERVICES ARE RESPONSIBLE FOR CREATING FUNCTIONS AND DATABASE OPERATION
 * */
@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {

    private final OrderRepository orderRepository;
    private final WebClient.Builder webClientBuilder; // Variable name must be same as the method name from /config/WebClientConfig
    private final String inventory_api = "http://inventory-service/api/inventory";

    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        List<OrderLineItems> orderLineItems = orderRequest.getOrderLineItemsDtoList()
                .stream()
                .map(this::mapToDto)
                .toList();

        order.setOrderLineItemsList(orderLineItems);

        List<String> skuCodes =  order.getOrderLineItemsList().stream()
                .map(OrderLineItems::getSkuCode)
                .toList();

        // CALL TO INVENTORY SERVICE, AND PLACE ORDER IF THE PRODUCT IS IN STOCK
        InventoryResponse[] inventoryResponses = webClientBuilder.build().get()
                .uri(inventory_api, uriBuilder -> uriBuilder.queryParam("skuCode", skuCodes).build() )
                .retrieve()
                .bodyToMono(InventoryResponse[].class) // By default it will make async request
                .block(); // By adding this line it will make sync request

        System.out.println("Inventory responses ======================");
        System.out.println(inventoryResponses.length);
        for(int i = 0; i< inventoryResponses.length; i++){
            System.out.println(inventoryResponses[i]);
        }
        boolean allProductsInStock = Arrays.stream(inventoryResponses).allMatch(InventoryResponse::isInStock);
        System.out.println("allProductsInStock ======================");
        System.out.println(allProductsInStock);
        if(allProductsInStock){
            orderRepository.save(order);
        }else{
            throw new IllegalArgumentException("Product is not is stock, please try again later");
        }
    }

    private OrderLineItems mapToDto(OrderLineItemsDto orderLineItemsDto) {
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setPrice(orderLineItemsDto.getPrice());
        orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
        orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());
        return orderLineItems;
    }
}

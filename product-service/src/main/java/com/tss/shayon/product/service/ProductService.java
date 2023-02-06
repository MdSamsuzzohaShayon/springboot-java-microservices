package com.tss.shayon.product.service;

import com.tss.shayon.product.dto.ProductRequest;
import com.tss.shayon.product.dto.ProductResponse;
import com.tss.shayon.product.model.Product;
import com.tss.shayon.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


/*
 * ===========================================================
 * SERVICES ARE RESPONSIBLE FOR CREATING FUNCTIONS AND DATABASE OPERATION
 * */
@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {


    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
        log.info("Product is saved");
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products =  productRepository.findAll();
//        System.out.println("Product list ==============");
//        System.out.println(products.stream().map( this::mapToProductResponse).toList());
        return products.stream().map( this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}

package com.tss.shayon.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//This inventory response class has been created inside order-service /dto
//We can not access this class from inventory-service, therefore, we need to duplicate the class
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventoryResponse {
    private String skuCode;
    private boolean isInStock;

}

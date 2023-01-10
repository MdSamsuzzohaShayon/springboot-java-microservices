package com.tss.shayon.inventoryservice.controller;

import com.tss.shayon.inventoryservice.dto.InventoryResponse;
import com.tss.shayon.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

//    endpoint = http://localhost:8082/api/inventory/?skuCode=qw-ds-2352&skuCode=qw-ds-2351&skuCode=qw-ds-2551
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode){
        return inventoryService.isInStock(skuCode);
    }
}

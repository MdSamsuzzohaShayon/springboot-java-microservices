package com.tss.shayon.inventoryservice.repository;

import com.tss.shayon.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/*
 * ===========================================================
 * REPOSITORY IS JUST AN INTERFACE THAT WILL ENFORCE US TO IMPLEMENT CERTAIN RULE
 * */
//Spring Data JPA provides repository support for the Jakarta Persistence API (JPA). It eases development of applications that need to access JPA data sources.
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}

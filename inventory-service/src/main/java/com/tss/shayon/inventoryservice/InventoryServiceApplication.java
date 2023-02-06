package com.tss.shayon.inventoryservice;

import com.tss.shayon.inventoryservice.model.Inventory;
import com.tss.shayon.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.Random;

/*
 * ===========================================================
 * RUNNING MAIN SPRING BOOT SERVER FROM HERE
 * */
//Registering with Eureka - https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#registering-with-eureka
@SpringBootApplication
@EnableDiscoveryClient
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

//	Spring Bean annotation is usually declared in Configuration classes methods
//	it will execute that method and register the return value as a bean within a BeanFactory
	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args -> {
			Random random = new Random();
			Inventory inventory = new Inventory();
			String uniqueInventorySku = String.format("%04d", random.nextInt(10000));
			inventory.setSkuCode("IS-PN-13-" + uniqueInventorySku );
			inventory.setQuantity(100);

			Inventory inventory1 = new Inventory();
			String uniqueInventorySku1 = String.format("%04d", random.nextInt(10000));
			inventory1.setSkuCode("IS-PN-14-"+uniqueInventorySku1);
			inventory1.setQuantity(0);

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
		};
	}

}

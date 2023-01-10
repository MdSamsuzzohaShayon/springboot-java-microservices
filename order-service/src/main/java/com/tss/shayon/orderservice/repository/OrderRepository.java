package com.tss.shayon.orderservice.repository;

import com.tss.shayon.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

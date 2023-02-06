package com.tss.shayon.orderservice.repository;

import com.tss.shayon.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * ===========================================================
 * REPOSITORY IS JUST AN INTERFACE THAT WILL ENFORCE US TO IMPLEMENT CERTAIN RULE
 * */
public interface OrderRepository extends JpaRepository<Order, Long> {

}

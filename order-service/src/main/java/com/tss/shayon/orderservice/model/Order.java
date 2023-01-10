package com.tss.shayon.orderservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "t_orders")
@Getter
@Setter
@NoArgsConstructor // Lombok @NoArgsConstructor will generate a no arguments/default constructor, by default generated constructor will be public
@AllArgsConstructor // The @AllArgsConstructor annotation generates a constructor with one parameter for every field in the class
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String orderNumber;
    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderLineItems> orderLineItems;

}

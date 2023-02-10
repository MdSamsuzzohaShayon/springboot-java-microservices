package com.tss.shayon.employeeservice.entity;

import jakarta.persistence.*;

/**
 * MAKE SOME DATABASE CALL USING THIS ENTITY
 */
//This guide walks you through the process of building an application that uses Spring Data JPA to store and retrieve data in a relational database.
@Entity
@Table(name= "Employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name="bloodgroup")
    private String bloodgroup;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }


}

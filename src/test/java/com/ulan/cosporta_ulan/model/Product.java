package com.ulan.cosporta_ulan.model;

import jakarta.persistence.*;

@Entity
@Table(name="Produk")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private Integer price;
    public Product(){
    }

    public Product(String name, Integer price){
        this.name= name;
        this.price = price;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getPrice(){
        return price;
    }

    public void setPrice(Integer price){
        this.price=price;
    }
}

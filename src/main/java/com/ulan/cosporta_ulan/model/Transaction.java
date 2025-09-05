package com.ulan.cosporta_ulan.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Transaksi")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productId;
    private String productName;
    private Integer quantity;
    private String paymentType;
    private Integer totalAmount;
    private LocalDateTime createdDate;

    public Transaction(){
    }

    public Transaction(Long productId, String productName, Integer quantity, String paymentType, Integer totalAmount, LocalDateTime createdDate){
        this.productId=productId;
        this.productName=productName;
        this.quantity=quantity;
        this.paymentType=paymentType;
        this.totalAmount=totalAmount;
        this.createdDate=createdDate;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public Long getProductId(){
        return productId;
    }

    public void setProductId(Long productId){
        this.productId=productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName){
        this.productName=productName;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public void setQuantity(Integer quantity){
        this.quantity=quantity;
    }
    public String getPaymentType(){
        return paymentType;
    }

    public void setPaymentType(String paymentType){
        this.paymentType=paymentType;
    }

    public Integer getTotalAmount(){
        return totalAmount;
    }
    public void setTotalAmount(Integer totalAmount){
        this.totalAmount=totalAmount;
    }

    public LocalDateTime getCreatedDate(){
        return createdDate;
    }

    public void setCreatedDate(){
        this.createdDate=createdDate;
    }
}

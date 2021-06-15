package com.egen.model;

import java.time.ZonedDateTime;
import java.util.List;

public class Order {
    private String orderId;
    private OrderStatus orderStatus;
    private String customerId;
    private List<OrderItem> orderItemList;
    private double orderTotal;
    private List<Payment> payments;
    private Address shippingAddress;
    private ZonedDateTime createdDate;
    private ZonedDateTime modifiedDate;
    private Delivery delivery;

    //Temp
    public Order (String orderId){
        this.orderId=orderId;
    }
    public Order(String orderId, OrderStatus orderStatus, String customerId,
        List<OrderItem> orderItemList, double orderTotal,
        List<Payment> payments, Address shippingAddress, ZonedDateTime createdDate,
        ZonedDateTime modifiedDate, Delivery delivery) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.customerId = customerId;
        this.orderItemList = orderItemList;
        this.orderTotal = orderTotal;
        this.payments = payments;
        this.shippingAddress = shippingAddress;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.delivery = delivery;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public ZonedDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(ZonedDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public ZonedDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(ZonedDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    @Override
    public String toString() {
        return "Order{" +
            "orderId='" + orderId + '\'' +
            ", orderStatus=" + orderStatus +
            ", customerId='" + customerId + '\'' +
            ", orderItemList=" + orderItemList +
            ", orderTotal=" + orderTotal +
            ", payments=" + payments +
            ", shippingAddress=" + shippingAddress +
            ", createdDate=" + createdDate +
            ", modifiedDate=" + modifiedDate +
            ", delivery=" + delivery +
            '}';
    }
}

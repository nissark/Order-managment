package com.egen.model;

public class Order {
    private  String id;

    public Order(String id){
        this.id = id;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
            "id='" + id + '\'' +
            '}';
    }
}

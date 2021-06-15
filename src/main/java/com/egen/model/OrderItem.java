package com.egen.model;


import java.util.UUID;

public class OrderItem {

  private String itemId;
  private String itemName;
  private String itemQuantity;
  private float itemPrice;

  public OrderItem(String itemId, String itemName, String itemQuantity, float itemPrice) {
    this.itemId = itemId;
    this.itemName = itemName;
    this.itemQuantity = itemQuantity;
    this.itemPrice = itemPrice;
  }

  public float getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(float itemPrice) {
    this.itemPrice = itemPrice;
  }

  public OrderItem(){
    this.itemId = UUID.randomUUID().toString();
  }

  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public String getItemQuantity() {
    return itemQuantity;
  }

  public void setItemQuantity(String itemQuantity) {
    this.itemQuantity = itemQuantity;
  }

  @Override
  public String toString() {
    return "OrderItem{" +
        "itemId='" + itemId + '\'' +
        ", itemName='" + itemName + '\'' +
        ", itemQty='" + itemQuantity + '\'' +
        '}';
  }
}

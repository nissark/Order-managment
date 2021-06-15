package com.egen.model;

public class Delivery {
  private String deliveryId;
  private DeliveryMethod deliveryMethod;
  private double deliveryCharge;

  public Delivery(String deliveryId, DeliveryMethod deliveryMethod, double deliveryCharge) {
    this.deliveryId = deliveryId;
    this.deliveryMethod = deliveryMethod;
    this.deliveryCharge = deliveryCharge;
  }

  public String getDeliveryId() {
    return deliveryId;
  }

  public void setDeliveryId(String deliveryId) {
    this.deliveryId = deliveryId;
  }

  public DeliveryMethod getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  public double getDeliveryCharge() {
    return deliveryCharge;
  }

  public void setDeliveryCharge(double deliveryCharge) {
    this.deliveryCharge = deliveryCharge;
  }

  @Override
  public String toString() {
    return "Delivery{" +
        "deliveryId='" + deliveryId + '\'' +
        ", deliveryMethod=" + deliveryMethod +
        ", deliveryCharge=" + deliveryCharge +
        '}';
  }
}

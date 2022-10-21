package com.example;

public class DeliveryInfoObject {
    private String address;
    private String customerName;
    private String deliveryInfo;
    public DeliveryInfoObject(String address, String customerName, String deliveryInfo){
                this.address=address;
                this.customerName=customerName;
                this.deliveryInfo=deliveryInfo;
    }

    public String getAddress() {
        return address;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDeliveryInfo() {
        return deliveryInfo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setDeliveryInfo(String deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
    }
}

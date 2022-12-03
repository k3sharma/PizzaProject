package com.example;

public class DeliveryInfoObject {
    private String address;
    private String deliveryType;
    private String deliveryInfo;
    public DeliveryInfoObject(String address, String deliveryInfo, String deliveryType){
                this.address=address;
                this.deliveryType=deliveryType;
                this.deliveryInfo=deliveryInfo;
    }

    public String getAddress() {
        return address;
    }



    public String getDeliveryInfo() {
        return deliveryInfo;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public void setDeliveryInfo(String deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
    }
}

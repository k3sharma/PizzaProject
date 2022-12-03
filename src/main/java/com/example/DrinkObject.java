package com.example;

public class DrinkObject {
    private String size;
    private String flavor;
    public DrinkObject(String size, String flavor){
        this.flavor=flavor;
        this.size=size;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}

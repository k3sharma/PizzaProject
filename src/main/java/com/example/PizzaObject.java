package com.example;

public class PizzaObject {
    private int size;
    private String crustType;
    private Boolean hasMozzarella;
    private Boolean hasExtraMozzarella;
    private Boolean hasCheddar;
    private Boolean hasExtraCheddar;
    private Boolean hasProvolone;
    private Boolean hasExtraProvolone;
    private Boolean hasParmesean;
    private Boolean hasExtraParmesean;

    private Boolean hasPepperoni;
    private Boolean hasExtraPepperoni;
    private Boolean hasHam;
    private Boolean hasExtraHam;
    private Boolean hasBacon;
    private Boolean hasExtraBacon;
    private Boolean hasBeef;
    private Boolean hasExtraBeef;
    private Boolean hasChicken;
    private Boolean hasExtraChicken;
    private Boolean hasPhillySteak;
    private Boolean hasExtraPhillySteak;

    private Boolean hasOnion;
    private Boolean hasExtraOnion;
    private Boolean hasBellPepper;
    private Boolean hasExtraBellPepper;
    private Boolean hasSpinach;
    private Boolean hasExtraSpinach;
    private Boolean hasTomato;
    private Boolean hasExtraTomato;
    private Boolean hasPineapple;
    private Boolean hasExtraPineapple;
    private Boolean hasBlackOlives;
    private Boolean hasExtraBlackOlives;

    private Boolean hasMushrooms;
    private Boolean hasExtraMushrooms;
    private Boolean hasBananaPeppers;
    private Boolean hasExtraBananaPeppers;
    private Boolean hasJalapenos;
    private Boolean hasExtraJalapenos;
    
    public PizzaObject(int size, String crustType, Boolean hasMozzarella, Boolean hasExtraMozzarella,Boolean hasCheddar,Boolean hasExtraCheddar,Boolean hasProvolone,Boolean hasExtraProvolone,Boolean hasParmesean,Boolean hasExtraParmesean,Boolean hasPepperoni,Boolean hasExtraPepperoni,Boolean hasHam,Boolean hasExtraHam,Boolean hasBacon,Boolean hasExtraBacon,Boolean hasBeef,Boolean hasExtraBeef,Boolean hasChicken,Boolean hasExtraChicken,Boolean hasPhillySteak,Boolean hasExtraPhillySteak,Boolean hasOnion,Boolean hasExtraOnion,Boolean hasBellPepper,Boolean hasExtraBellPepper,Boolean hasSpinach,Boolean hasExtraSpinach,Boolean hasTomato,Boolean hasExtraTomato,Boolean hasPineapple,Boolean hasExtraPineapple,Boolean hasBlackOlives,Boolean hasExtraBlackOlives,Boolean hasMushrooms,Boolean hasExtraMushrooms,Boolean hasBananaPeppers,Boolean hasExtraBananaPeppers,Boolean hasJalapenos,Boolean hasExtraJalapenos){
        this.size=size;
        this.crustType=crustType;
        this.hasMozzarella=hasMozzarella;
        this.hasExtraMozzarella=hasExtraMozzarella;
        this.hasCheddar=hasCheddar;
        this.hasExtraCheddar=hasExtraCheddar;
        this.hasProvolone=hasProvolone;
        this.hasExtraProvolone=hasExtraProvolone;
        this.hasParmesean=hasParmesean;
        this.hasExtraParmesean=hasExtraParmesean;
        this.hasPepperoni=hasPepperoni;
        this.hasExtraPepperoni=hasExtraPepperoni;
        this.hasHam=hasHam;
        this.hasExtraHam=hasExtraHam;
        this.hasBacon=hasBacon;
        this.hasExtraBacon=hasExtraBacon;
        this.hasBeef=hasBeef;
        this.hasExtraBeef=hasExtraBeef;
        this.hasChicken=hasChicken;
        this.hasExtraChicken=hasExtraChicken;
        this.hasPhillySteak=hasPhillySteak;
        this.hasExtraPhillySteak=hasExtraPhillySteak;
        this.hasOnion=hasOnion;
        this.hasExtraOnion=hasExtraOnion;
        this.hasBellPepper=hasBellPepper;
        this.hasExtraBellPepper=hasExtraBellPepper;
        this.hasSpinach=hasSpinach;
        this.hasExtraSpinach=hasExtraSpinach;
        this.hasTomato=hasTomato;
        this.hasExtraTomato=hasExtraTomato;
        this.hasPineapple=hasPineapple;
        this.hasExtraPineapple=hasExtraPineapple;
        this.hasBlackOlives=hasBlackOlives;
        this.hasExtraBlackOlives=hasExtraBlackOlives;
        this.hasMushrooms=hasMushrooms;
        this.hasExtraMushrooms=hasExtraMushrooms;
        this.hasBananaPeppers=hasBananaPeppers;
        this.hasExtraBananaPeppers=hasExtraBananaPeppers;
        this.hasJalapenos=hasJalapenos;
        this.hasExtraJalapenos=hasExtraJalapenos;
    }

    public Boolean getHasMozzarella(){
        return hasMozzarella;
    }

    public Boolean getHasBacon() {
        return hasBacon;
    }

    public Boolean getHasBeef() {
        return hasBeef;
    }

    public Boolean getHasBellPepper() {
        return hasBellPepper;
    }

    public Boolean getHasCheddar() {
        return hasCheddar;
    }

    public Boolean getHasChicken() {
        return hasChicken;
    }

    public Boolean getHasExtraBacon() {
        return hasExtraBacon;
    }

    public Boolean getHasExtraBeef() {
        return hasExtraBeef;
    }

    public Boolean getHasExtraBellPepper() {
        return hasExtraBellPepper;
    }

    public Boolean getHasExtraCheddar() {
        return hasExtraCheddar;
    }

    public Boolean getHasExtraChicken() {
        return hasExtraChicken;
    }

    public Boolean getHasExtraHam() {
        return hasExtraHam;
    }

    public Boolean getHasExtraMozzarella() {
        return hasExtraMozzarella;
    }

    public Boolean getHasExtraParmesean() {
        return hasExtraParmesean;
    }

    public Boolean getHasExtraOnion() {
        return hasExtraOnion;
    }

    public Boolean getHasExtraPepperoni() {
        return hasExtraPepperoni;
    }

    public Boolean getHasExtraPhillySteak() {
        return hasExtraPhillySteak;
    }

    public Boolean getHasExtraProvolone() {
        return hasExtraProvolone;
    }

    public Boolean getHasExtraSpinach() {
        return hasExtraSpinach;
    }

    public Boolean getHasHam() {
        return hasHam;
    }

    public Boolean getHasOnion() {
        return hasOnion;
    }

    public Boolean getHasParmesean() {
        return hasParmesean;
    }

    public Boolean getHasPepperoni() {
        return hasPepperoni;
    }

    public Boolean getHasPhillySteak() {
        return hasPhillySteak;
    }

    public Boolean getHasProvolone() {
        return hasProvolone;
    }

    public int getSize() {
        return size;
    }

    public String getCrustType() {
        return crustType;
    }

    public Boolean getHasSpinach() {
        return hasSpinach;
    }

    public void setCrustType(String crustType) {
        this.crustType = crustType;
    }

    public void setHasBacon(Boolean hasBacon) {
        this.hasBacon = hasBacon;
    }

    public void setHasBeef(Boolean hasBeef) {
        this.hasBeef = hasBeef;
    }

    public void setHasBellPepper(Boolean hasBellPepper) {
        this.hasBellPepper = hasBellPepper;
    }

    public void setHasCheddar(Boolean hasCheddar) {
        this.hasCheddar = hasCheddar;
    }

    public void setHasChicken(Boolean hasChicken) {
        this.hasChicken = hasChicken;
    }

    public void setHasExtraBacon(Boolean hasExtraBacon) {
        this.hasExtraBacon = hasExtraBacon;
    }

    public void setHasExtraBeef(Boolean hasExtraBeef) {
        this.hasExtraBeef = hasExtraBeef;
    }

    public void setHasExtraCheddar(Boolean hasExtraCheddar) {
        this.hasExtraCheddar = hasExtraCheddar;
    }

    public void setHasExtraBellPepper(Boolean hasExtraBellPepper) {
        this.hasExtraBellPepper = hasExtraBellPepper;
    }

    public Boolean getHasExtraTomato() {
        return hasExtraTomato;
    }

    public Boolean getHasTomato() {
        return hasTomato;
    }

    public void setHasExtraChicken(Boolean hasExtraChicken) {
        this.hasExtraChicken = hasExtraChicken;
    }

    public void setHasExtraHam(Boolean hasExtraHam) {
        this.hasExtraHam = hasExtraHam;
    }

    public void setHasExtraMozzarella(Boolean hasExtraMozzarella) {
        this.hasExtraMozzarella = hasExtraMozzarella;
    }

    public void setHasExtraParmesean(Boolean hasExtraParmesean) {
        this.hasExtraParmesean = hasExtraParmesean;
    }

    public void setHasExtraOnion(Boolean hasExtraOnion) {
        this.hasExtraOnion = hasExtraOnion;
    }

    public void setHasExtraPepperoni(Boolean hasExtraPepperoni) {
        this.hasExtraPepperoni = hasExtraPepperoni;
    }

    public Boolean getHasPineapple() {
        return hasPineapple;
    }

    public void setHasExtraPhillySteak(Boolean hasExtraPhillySteak) {
        this.hasExtraPhillySteak = hasExtraPhillySteak;
    }

    public Boolean getHasExtraPineapple() {
        return hasExtraPineapple;
    }

    public void setHasExtraProvolone(Boolean hasExtraProvolone) {
        this.hasExtraProvolone = hasExtraProvolone;
    }

    public void setHasExtraSpinach(Boolean hasExtraSpinach) {
        this.hasExtraSpinach = hasExtraSpinach;
    }

    public void setHasExtraTomato(Boolean hasExtraTomato) {
        this.hasExtraTomato = hasExtraTomato;
    }

    public void setHasHam(Boolean hasHam) {
        this.hasHam = hasHam;
    }

    public void setHasMozzarella(Boolean hasMozzarella) {
        this.hasMozzarella = hasMozzarella;
    }

    public void setHasOnion(Boolean hasOnion) {
        this.hasOnion = hasOnion;
    }

    public void setHasExtraPineapple(Boolean hasExtraPineapple) {
        this.hasExtraPineapple = hasExtraPineapple;
    }

    public void setHasParmesean(Boolean hasParmesean) {
        this.hasParmesean = hasParmesean;
    }

    public void setHasPepperoni(Boolean hasPepperoni) {
        this.hasPepperoni = hasPepperoni;
    }

    public void setHasPhillySteak(Boolean hasPhillySteak) {
        this.hasPhillySteak = hasPhillySteak;
    }

    public Boolean getHasBananaPeppers() {
        return hasBananaPeppers;
    }

    public void setHasPineapple(Boolean hasPineapple) {
        this.hasPineapple = hasPineapple;
    }

    public Boolean getHasBlackOlives() {
        return hasBlackOlives;
    }

    public Boolean getHasExtraBlackOlives() {
        return hasExtraBlackOlives;
    }

    public Boolean getHasExtraMushrooms() {
        return hasExtraMushrooms;
    }

    public Boolean getHasExtraBananaPeppers() {
        return hasExtraBananaPeppers;
    }

    public Boolean getHasExtraJalapenos() {
        return hasExtraJalapenos;
    }

    public Boolean getHasMushrooms() {
        return hasMushrooms;
    }

    public Boolean getHasJalapenos() {
        return hasJalapenos;
    }

    public void setHasBananaPeppers(Boolean hasBananaPeppers) {
        this.hasBananaPeppers = hasBananaPeppers;
    }

    public void setHasBlackOlives(Boolean hasBlackOlives) {
        this.hasBlackOlives = hasBlackOlives;
    }

    public void setHasExtraBlackOlives(Boolean hasExtraBlackOlives) {
        this.hasExtraBlackOlives = hasExtraBlackOlives;
    }

    public void setHasExtraBananaPeppers(Boolean hasExtraBananaPeppers) {
        this.hasExtraBananaPeppers = hasExtraBananaPeppers;
    }

    public void setHasExtraJalapenos(Boolean hasExtraJalapenos) {
        this.hasExtraJalapenos = hasExtraJalapenos;
    }

    public void setHasMushrooms(Boolean hasMushrooms) {
        this.hasMushrooms = hasMushrooms;
    }

    public void setHasExtraMushrooms(Boolean hasExtraMushrooms) {
        this.hasExtraMushrooms = hasExtraMushrooms;
    }

    public void setHasJalapenos(Boolean hasJalapenos) {
        this.hasJalapenos = hasJalapenos;
    }

    public void setHasProvolone(Boolean hasProvolone) {
        this.hasProvolone = hasProvolone;
    }

    public void setHasSpinach(Boolean hasSpinach) {
        this.hasSpinach = hasSpinach;
    }

    public void setHasTomato(Boolean hasTomato) {
        this.hasTomato = hasTomato;
    }

    public void setSize(int size) {
        this.size = size;
    }

}

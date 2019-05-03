package com.homework4;

public abstract class Car {

    int price;
    String type;
    Engine engine;
    Wheels wheel;


    public Car(String type, Engine engine, Wheels wheel) {
        this.type = type;
        this.engine = engine;
        this.wheel = wheel;
     }

    public abstract int getPrice();


}

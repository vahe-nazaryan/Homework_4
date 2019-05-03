package com.homework4;

public class Hatchback extends Car {
    private int price = 15000;


    public Hatchback (String type, Engine engine, Wheels wheel) {
        super(type, engine, wheel);
    }

    public int getPrice() {
        return price ;
    }

}

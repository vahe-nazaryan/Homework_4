package com.homework4;

public class Crossover extends Car {
    private int price = 35000;


    public Crossover (String type, Engine engine, Wheels wheel) {
        super(type, engine, wheel);
    }

    public int getPrice() {
        return price ;
    }


}

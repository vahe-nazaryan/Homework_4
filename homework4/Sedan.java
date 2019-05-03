package com.homework4;

public class Sedan extends Car {


   private int price = 20000;


    public Sedan(String type, Engine engine, Wheels wheel) {
        super(type, engine, wheel);
    }

    public int getPrice() {
        return price ;
    }

    }

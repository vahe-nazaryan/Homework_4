package com.homework4;

public class TestApp {


    public static void main(String[] args) {

        String[] input = TakingInputsFromCustomer.takeInput();
        String typePreferred = input[0];
        String enginePreferred = input[1];
        String wheelPreferred = input[2];

        CarFabric fabric = new CarFabric();
        fabric.constructCar(typePreferred, enginePreferred, wheelPreferred);


        //CarFabric c = new CarFabric();


      }

}

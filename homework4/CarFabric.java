package com.homework4;

public class CarFabric {

    //Creating different engines types

    Engine electrical = new Electrical();
    Engine diesel = new Diesel();
    Engine petrol = new Diesel();
    Engine hybrid = new Diesel();


    // Creating different Wheel types

    Wheels wheel4 = new WheelAll();
    Wheels frontWheel = new FrontWheel();
    Wheels backWheel = new BackWheel();

    // Creating car objects depending on the input of customer


    public Car constructCar(String typePreferred, String enginePreferred, String wheelPreferred){
        Car car = null;
        if (typePreferred.equals("sedan")&&enginePreferred.equals("diesel")&&wheelPreferred.equals("backwheel")){
            car = new Sedan("sedan", diesel, backWheel);
            int priceOfCar = car.getPrice() + diesel.getPrice() + wheel4.getPrice();
            System.out.println("The price of the car you ordered is " + priceOfCar);
        }
        else if (typePreferred.equals("crossover")&&enginePreferred.equals("diesel")&&wheelPreferred.equals("wheel4")){
            car = new Crossover("crossover", diesel, wheel4);
            int priceOfCar = car.getPrice() + diesel.getPrice() + wheel4.getPrice();
            System.out.println("The price of the car you ordered is " + priceOfCar);
        }
        else if (typePreferred.equals("hatchback")&&enginePreferred.equals("diesel")&&wheelPreferred.equals("frontwheel")){
            car = new Hatchback("hatchback", diesel, wheel4);
            int priceOfCar = car.getPrice() + diesel.getPrice() + frontWheel.getPrice();
            System.out.println("The price of the car you ordered is " + priceOfCar);
        }


        return car;
    }


}

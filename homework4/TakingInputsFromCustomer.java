package com.homework4;

import java.util.Scanner;

public class TakingInputsFromCustomer {


    static String[] takeInput(){

        String inputDate [] = new String[3];

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter type of the car: Valid data are -- sedan -- , -- hatchback --, -- crossover --");
        String type = scan.nextLine();
        System.out.println("Please enter engine type: Valid data are -- electrical -- , -- diesel --, -- petrol -- , -- hybrid --");
        String engine = scan.nextLine();
        System.out.println("please enter wheel type: Valid data are -- wheel4 -- , -- frontwheel -- , -- backwheel --");
        String wheel = scan.nextLine();

        inputDate [0] = type;
        inputDate [1] = engine;
        inputDate [2] = wheel;

        return inputDate;


    }

}

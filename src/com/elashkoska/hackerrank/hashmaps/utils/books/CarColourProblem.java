package com.elashkoska.hackerrank.hashmaps.utils.books;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarColourProblem {
    public static void main(String[] args) {

        Map<Integer, String> colourCar = new HashMap<>();
        colourCar.put(1, "red");
        colourCar.put(2, "blue");
        colourCar.put(3, "white");

        Scanner myObject = new Scanner(System.in);
        int input = myObject.nextInt();
        System.out.println("Enter number:" + input);
        System.out.println("colour is " + colourCar.get(input));


    }

}

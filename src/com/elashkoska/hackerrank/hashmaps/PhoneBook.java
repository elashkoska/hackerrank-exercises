package com.elashkoska.hackerrank.hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {


    public static void main(String[] argh) {
        Map<String, Integer> phoneNumber = new HashMap<>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            phoneNumber.put(name, phone);

        }
        while (in.hasNext()) {
            String s = in.nextLine();
           // System.out.println(s);
            if (phoneNumber.get(s) == null) {
                System.out.println("Not found");
            } else
                System.out.println(s + "=" + phoneNumber.get(s));
//                phoneNumber.forEach((a, b) -> {
//                    System.out.println("" + a + "=" + b);
//                });
        }

    }
}



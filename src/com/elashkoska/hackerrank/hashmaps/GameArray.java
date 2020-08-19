package com.elashkoska.hackerrank.hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GameArray {
    public static void main(String[] argh) {
        List<String> words = new ArrayList<>();
        System.out.println("Enter number of strings");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println("Enter the strings");
        for (int i = 0; i < n; i++) {
            words.add(in.next());
        }

        System.out.println(words);

        Map<List<String>, Integer> stringCount = new HashMap<>();
        int count = stringCount.containsKey(words)? stringCount.get(words):0;
        stringCount.put(words, count+1);
        System.out.println(stringCount.get(count));

        //        Map<String, Long> countStrings = words.stream().collect(Collectors.groupingBy(e -> e.toString(),Collectors.counting()));
//        System.out.println(countStrings);

//        for (int j = 0; j < words.size() - 1; j++) {
//            int count = 0;
//            for (int k = j; k < words.size(); k++) {
//                if (words.get(j).equals(words.get(k))) {
//                    count++;
//                }
//            }
//            System.out.println(words.get(j) + " ---> " + count);
//        }

    }
}




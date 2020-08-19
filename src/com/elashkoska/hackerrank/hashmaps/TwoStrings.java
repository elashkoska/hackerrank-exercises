package com.elashkoska.hackerrank.hashmaps;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoStrings {
    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        Set<Character> charactersString1 = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            charactersString1.add(s1.charAt(i));
        }

        for (int i = 0; i < s2.length(); i++) {
            if (charactersString1.contains(s2.charAt(i))) {
                return "YES";
            }
        }

        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
            System.out.println(result);
        }

//        bufferedWriter.close();

        scanner.close();
    }
}

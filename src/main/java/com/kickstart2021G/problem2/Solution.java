package com.kickstart2021G.problem2;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        // Stay Hydrated

        // input
        // T number of test cases
        // N number of animals
        // D initial number of dog food portions
        // C initial number of cat food portions
        // M the additional portions of cat food that we add after a dog eats a portion of dog food
        // S of length N representing the arrangement of animals

        // file format
        // T
        // N D C M
        // S

        // sample
        // 1
        // 3
        // 0 0 1 1
        // 2 3 4 6
        // 0 3 5 9

        // output
        // For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1)
        // and y is YES if all the dogs will be fed and NO otherwise.

        //Boolean printTime = Boolean.FALSE;
        //Instant start = Instant.now();

        Scanner input = new Scanner(new InputStreamReader(System.in));
        int t = input.nextInt();
        for (int i = 1; i <= t; ++i) {
            int n = input.nextInt();
            String s = input.next();
            char last = 0;
            int sum = 0;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (last < s.toCharArray()[j]) {
                    sum++;
                } else {
                    sum = 1;
                }
                last = s.toCharArray()[j];
                sb.append(sum).append(" ");
            }

            System.out.println("Case #" + i + ": " + sb);
        }

        //if(printTime) {
        //    Instant end = Instant.now();
        //    System.out.println(Duration.between(start, end));
        //}
    }
}

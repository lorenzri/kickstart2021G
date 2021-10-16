package com.kickstart2021G.problem1;

import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) throws Exception {

        // Smaller Strings

        // T number of test cases
        // N number of characters in S
        // K the first K characters of the english alphabet are usable
        // S String of length N consisting of lower case letters

        // file format
        // T
        // N K
        // S
        // 1
        // 2 3
        // bcs

        Boolean printTime = Boolean.TRUE;

        Instant start = Instant.now();

        Scanner input = new Scanner(new InputStreamReader(System.in));
        int t = input.nextInt();
        for (int i = 1; i <= t; ++i) {
            int n = input.nextInt();
            int k = input.nextInt();
            String s = input.next();
            BigInteger sum = new BigInteger("0");
            char[] sArray = s.toCharArray();
            char[] guess = new char[n];
            Arrays.fill(guess, 'a');

            System.out.println("Case #" + i + ": " + (sum.mod(BigInteger.TEN.pow(9).add(BigInteger.valueOf(7)))));
        }

        if(printTime) {
            Instant end = Instant.now();
            System.out.println(Duration.between(start, end));
        }
    }
}

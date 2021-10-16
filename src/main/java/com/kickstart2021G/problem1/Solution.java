package com.kickstart2021G.problem1;

import java.io.InputStreamReader;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {

        // Dogs and Cats

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
        // 6 10 4 0
        // CCDCDD

        // output
        // For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1)
        // and y is YES if all the dogs will be fed and NO otherwise.

        Boolean printTime = Boolean.FALSE;
        Instant start = Instant.now();

        Scanner input = new Scanner(new InputStreamReader(System.in));
        int t = input.nextInt();
        for (int i = 1; i <= t; ++i) {
            String allDogsFed = null;
            int n = input.nextInt();
            long d = input.nextLong();
            long c = input.nextLong();
            long m = input.nextLong();
            String s = input.next();

            // if no dog is in line
            if(s.lastIndexOf('D') == -1){
                allDogsFed = "YES";
                System.out.println("Case #" + i + ": " + allDogsFed);
                continue;
            }

            // for every animal
            for(int a = 0; a < n ; a++){
                // if its a cat
                if(s.charAt(a) == 'C') {
                    if (c == 0) {
                        if (s.lastIndexOf('D') <= a) {
                            allDogsFed = "YES";
                        } else {
                            allDogsFed = "NO";
                        }
                        System.out.println("Case #" + i + ": " + allDogsFed);
                        break;
                    }
                    c--;
                } else {
                    // if its a dog
                    if(d == 0){
                        System.out.println("Case #" + i + ": NO");
                        break;
                    }
                    d--;
                    c+=m;
                }
                // all animals fed
                if((a+1) == n && d >= 0){
                    System.out.println("Case #" + i + ": YES");
                    break;
                }
                // if dog food is empty
                if(d == 0){
                    if(s.lastIndexOf('D') <= a){
                        allDogsFed = "YES";
                    } else {
                        allDogsFed = "NO";
                    }
                    System.out.println("Case #" + i + ": " + allDogsFed);
                    break;
                }
                // if cat food is empty
                if(c == 0 && s.charAt(a+1) == 'C'){
                    if(s.lastIndexOf('D') <= a){
                        allDogsFed = "YES";
                    } else {
                        allDogsFed = "NO";
                    }
                    System.out.println("Case #" + i + ": " + allDogsFed);
                    break;
                }
            }
        }

        if(printTime) {
            Instant end = Instant.now();
            System.out.println(Duration.between(start, end));
        }
    }
}

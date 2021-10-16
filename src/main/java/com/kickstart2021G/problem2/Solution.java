package com.kickstart2021G.problem2;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        // Staying Hydrated

        // input
        // T number of test cases
        // K number of objects
        // Xi1 xi2 bottom left corner
        // yi1 yi2 top right corner

        // file format
        // T
        // K
        // Xi1 xi2 yi1 yi2

        // sample
        // 1
        // 3
        // 0 0 1 1
        // 2 3 4 6
        // 0 3 5 9

        // output
        // Case #i: x y
        // x and y represent the position of the water bottle

        //Boolean printTime = Boolean.FALSE;
        //Instant start = Instant.now();

        Scanner input = new Scanner(new InputStreamReader(System.in));
        int t = input.nextInt();
        for (int i = 1; i <= t; ++i) {
            List<Furniture> furniture = new ArrayList<>();
            Position min = null;
            Position max = null;
            int k = input.nextInt();

            // read furniture information
            for (int j = 0; j < k; j++) {
                Furniture f = new Furniture();
                f.x1 = input.nextInt();
                f.y1 = input.nextInt();
                f.x2 = input.nextInt();
                f.y2 = input.nextInt();
                furniture.add(f);
            }

            // calculate min and max positions
            for (Furniture f : furniture) {
                if(min == null){
                    min = new Position();
                    min.x = f.x1;
                    min.y = f.y1;
                }
                if(max == null){
                    max = new Position();
                    max.x = f.x2;
                    max.y = f.y2;
                }
                // bottom left corner
                if(f.x1 < min.x){
                    min.x = f.x1;
                }
                if(f.y1 < min.y){
                    min.y = f.y1;
                }
                // top right corner
                if(f.x2 > max.x){
                    max.x = f.x2;
                }
                if(f.y2 > max.y){
                    max.y = f.y2;
                }
            }

            // Check areas
            for (Furniture f : furniture) {
                System.out.println(f);
            }
            System.out.println(min);
            System.out.println(max);

            // calculate water bottle position
        }

        //if(printTime) {
        //    Instant end = Instant.now();
        //    System.out.println(Duration.between(start, end));
        //}
    }

    static class Furniture {
        Integer x1, y1, x2, y2 = null;

        @Override
        public String toString() {
            return "Furniture{" +
                    "x1=" + x1 +
                    ", y1=" + y1 +
                    ", x2=" + x2 +
                    ", y2=" + y2 +
                    '}';
        }
    }

    static class Position {
        Integer x, y = null;

        @Override
        public String toString() {
            return "Position{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}

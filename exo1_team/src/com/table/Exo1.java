package com.table;

import java.util.Arrays;

public class Exo1 {

    public static void main(String[] args) {
        int[][] numbers = {
                {1,2,3,4,5,5},
                {6,8,9,7,5,6,47},
                {44,55,22,3,66,8,81}
        };

        for (int[] number:numbers
             ) {
            for (int entier:number
                 ) {
                if (entier%2==0)
                    System.out.println("Number = " + entier);
            }
        }
    }
}

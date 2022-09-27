package com;

import java.util.Arrays;

public class exo {
    public static void main(String[] args) {
        int[] entiers = new int[]{1,2,3};


        entiers = new int[]{entiers[0],entiers[2],4};

        for (int entier:entiers
             ) {
            System.out.println(entier);
        }
    }
}

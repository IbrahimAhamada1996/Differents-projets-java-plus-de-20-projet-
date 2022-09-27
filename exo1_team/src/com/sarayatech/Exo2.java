package com.sarayatech;


public class Exo2 {
    public static void main(String[] args) {

        int[] entiers = new int[]{1,7,4,5,8,6,8,6,6,9};

        for (int i = 0; i <entiers.length ; i++) {
            for (int j = i+1; j < entiers.length; j++) {
                if (entiers[i]<entiers[j]){
                    int temp= entiers[i];
                    entiers[i] = entiers[j];
                    entiers[j] = temp;
                }
            }
        }

        for (int entier: entiers
             ) {
            System.out.println(entier);
        }
    }
}

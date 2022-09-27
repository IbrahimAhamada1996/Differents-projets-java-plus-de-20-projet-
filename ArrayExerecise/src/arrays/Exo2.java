package arrays;

import java.util.Arrays;

public class Exo2 {

    public static void main(String[] args) {
        int[] entiers  = new int[]{1,2,3,4,5,6,7,8,9,8,5,6,5,66,6,9};


        for (int entier: entiers
             ) {
            entier*=2;

            System.out.println("double number = " +entier);
        }
    }
}

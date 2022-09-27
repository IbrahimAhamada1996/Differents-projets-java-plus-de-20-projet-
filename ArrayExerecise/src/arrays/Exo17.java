package arrays;

import java.util.Arrays;

public class Exo17 {
    public static void main(String[] args) {
        int[] entiers  = new int[]{1,0,2,3,411,55,-22,63,789,7,0,-6,-7,0,-8};
        int numberPositive=0;
        int numberNegative=0;
        int numberNull=0;
        for (int entier:entiers
             ) {
            if (entier<0)numberNegative++;

            if (entier>0) numberPositive++;

            if (entier==0) numberNull++;
        }

        System.out.println("Number positive : = " + numberPositive);
        System.out.println("Number negative : = " + numberNegative);
        System.out.println("Number null : = " + numberNull);
    }
}

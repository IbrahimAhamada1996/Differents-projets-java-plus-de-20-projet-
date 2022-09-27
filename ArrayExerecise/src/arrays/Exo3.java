package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exo3 {

    public static void main(String[] args) {
        int[] entiers  = new int[]{1,2,899,3,4,5,6,7,8,9,8,6,5,66,6,9};
        for (int entier:entiers
             ) {
            boolean isPrime=true;
            for (int j = 2; j <entier ; j++) {
                if (entier%j==0){
                    isPrime=false;
                }

            }
            if (isPrime)
                System.out.println("number prime = " +entier);

        }


    }
}

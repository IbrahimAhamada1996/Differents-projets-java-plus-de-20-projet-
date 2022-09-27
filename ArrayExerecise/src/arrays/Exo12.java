package arrays;

import java.util.Arrays;

public class Exo12 {
    public static void main(String[] args) {
        int[] entiers  = new int[]{1,0,2,3,4,5,6,7,8,9,8,5,66,6,9};
        int[] entiers2  = new int[]{1,0,2,3,411,55,63,789,7};

        for (int entier1:entiers
             ) {
            for (int entier2:entiers2
            ) {
                if (entier1==entier2)
                    System.out.println(entier1);
            }
        }
    }
}

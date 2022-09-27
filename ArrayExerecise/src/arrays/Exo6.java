package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exo6 {
    public static void main(String[] args) {

        int[] entiers  = new int[]{1,2,3,6,4,9,5,6,56,5,6,6,6,8,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nmber entier ");
        int n = sc.nextInt();

        int i=0;
        for (int entier:entiers
             ) {
            if (entier==n){
                entiers[i] = n;
            }
        }

        System.out.println("args = " + Arrays.toString(entiers));


    }
}

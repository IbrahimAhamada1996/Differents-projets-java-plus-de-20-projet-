package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class  Exo5 {
    public static void main(String[] args) {
        List<Integer> entiers = Arrays.asList(1,2,3,6,4,9,5,6,56,5,6,6,6,8,5,6);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nmber entier ");
        int n = sc.nextInt();
        System.out.println(n+" find to index " +entiers.indexOf(n));

        //////////////////*************************************//////////////////////////////////////////
        int[] entiers2  = new int[]{1,2,3,6,4,9,5,6,56,5,6,6,6,8,5,6};

        for (int i = 0; i <entiers2.length; i++) {
            if (entiers2[i]==n){

                System.out.println(n+" find to index " + i);
                break;
            }

        }

    }
}

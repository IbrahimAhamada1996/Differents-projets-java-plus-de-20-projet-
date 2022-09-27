package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exo4 {

    public static void main(String[] args) {
        int[] entiers  = new int[]{1,2,3,4,5,6,7,8,9,8,5,6,5,66,6,9};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter nmber entier ");
          int n = sc.nextInt();
          boolean isExist = false;
        for (int entier:entiers
        ) {
            if (entier==n)
               isExist=true;
        }

        if (isExist)
            System.out.println(n+" exist in the table");
        else
            System.out.println(n+" doesn't exist in the table");
    }

}

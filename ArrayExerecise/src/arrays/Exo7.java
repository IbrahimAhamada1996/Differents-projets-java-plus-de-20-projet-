package arrays;

import java.util.Arrays;

public class Exo7 {

    public static void main(String[] args) {
        int[] number = new int[]{1,2 ,3 ,4 ,5,4};

        int[] newNumber  = new int[number.length+1];
        int j=0;
        for (int i = 0; i <number.length ; i++) {

            newNumber[j++]=number[i];
        }

        newNumber[newNumber.length-1]=9;

        System.out.println("args = " + Arrays.toString(newNumber));
    }
}

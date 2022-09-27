package arrays;

import java.util.Arrays;

public class Exo8 {

    public static void main(String[] args) {
        int[] numbers = new int[]{1,2 ,32 ,43 ,5,4};
        int[] newNumbers  = new int[numbers.length];
        int j=0;
        for (int i = 0; i < numbers.length; i++) {
            newNumbers[j++]=numbers[numbers.length-1-i];
        }
        System.out.println("BEFOR TABLE= " + Arrays.toString(numbers));
        System.out.println("REVERSE TABLE= " + Arrays.toString(newNumbers));
    }
}

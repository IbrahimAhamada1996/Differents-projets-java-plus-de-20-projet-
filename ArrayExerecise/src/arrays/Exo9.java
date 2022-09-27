package arrays;

import java.util.Arrays;

public class Exo9 {

    public static void main(String[] args) {
        int[] entiers  = new int[]{1,0,2,3,4,5,6,7,8,9,8,5,6,5,66,6,9};

        for (int i = 0; i <entiers.length ; i++) {
            for (int j = i+1; j < entiers.length; j++) {
                if (entiers[i]<entiers[j]){
                    int temp = entiers[i];
                    entiers[i]=entiers[j];
                    entiers[j]=temp;
                }

            }
        }
        System.out.println("args = " + Arrays.toString(entiers));
    }
}

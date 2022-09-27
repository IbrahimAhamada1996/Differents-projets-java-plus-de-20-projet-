package arrays;

import java.util.Arrays;

public class Exo16 {

    public static void main(String[] args) {
        int[] entiers  = new int[]{1,0,2,3,411,55,63,789,7};
        int a=entiers[entiers.length-1];
        for (int i = entiers.length-1; i > 0; i--) {
            entiers[i]=entiers[i-1];
        }
        entiers[0]=a;
        System.out.println("args = " + Arrays.toString(entiers));
    }
}

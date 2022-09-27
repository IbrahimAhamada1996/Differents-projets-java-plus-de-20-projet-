package arrays;

import java.nio.channels.CancelledKeyException;
import java.util.Arrays;

public class Exo14 {

    public static void main(String[] args) {
        int[] A = { 1, 5, 6, 7, 8, 10 };
        int[] B = { 2, 4, 9 };
        int[] C=new int[A.length+B.length];

        for (int i = 0; i <A.length ; i++) {
            C[i]=A[i];
        }

        int k=A.length;
        for (int i = 0; i <B.length ; i++) {
            C[k]=B[i];
            k++;
        }
        for (int i = 0; i <C.length; i++) {
            int min = Integer.MIN_VALUE;
            for (int j = i+1; j <C.length ; j++) {
                if(C[i]>C[j]){
                    int temp=C[i];
                    C[i]=C[j];
                    C[j]=temp;
                }
            }
        }

        for (int i = 0; i <A.length ; i++) {
            A[i]=C[i];
        }

        int Ck = A.length;
        for (int i = 0; i <B.length ; i++) {
            B[i]=C[Ck];
            Ck++;
        }
        System.out.println("Sorted Arrays:");
        System.out.println("C : " + Arrays.toString(C));
        System.out.println("A : " + Arrays.toString(A));
        System.out.println("B : " + Arrays.toString(B));

    }
}

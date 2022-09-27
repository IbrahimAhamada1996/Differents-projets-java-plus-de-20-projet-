package arrays;

import java.util.Arrays;

public class  Exo18 {

    public static void main(String[] args) {
        int[] entiers  = new int[]{1,0,25,3,4,5,6,7,8,5,15,6,9,-6};
         int   min=entiers[0];
         int   max=entiers[0];
        for (int i = 0; i < entiers.length; i++) {
            if (min>entiers[i]){
                min=entiers[i];
            }
        }

        for (int i = 0; i < entiers.length; i++) {
            if (max<entiers[i]){
                max=entiers[i];
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        int tabLenght= (min+max)/entiers.length;
        int[] tab1=new int[entiers.length];
        int[] tab2=new int[entiers.length];
        for (int i = 0; i < entiers[i]; i++) {

            if (entiers[i]<tabLenght){
                tab1[i]=entiers[i];
            }

            if (entiers[i]>tabLenght){
                tab2[i]=entiers[i];
            }

        }
        System.out.println("entiers = " + Arrays.toString(entiers));
        System.out.println("tab1 = " + Arrays.toString(tab1));
        System.out.println("tab2 = " + Arrays.toString(tab2));
    }
}

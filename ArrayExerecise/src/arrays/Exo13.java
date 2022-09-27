package arrays;

import java.util.Arrays;

public class Exo13 {
    public static void main(String[] args) {
        int[] entiers  = new int[]{1,0,215,3,4,5,6,7,8,5,66,6,9};

        for (int i = 0; i <entiers.length ; i++) {
            boolean isLeader=true;
            for (int j = i+1; j < entiers.length; j++) {
                if(entiers[i]<entiers[j]){
                    isLeader=false;
                    break;
                }
            }
            if (isLeader)
                 System.out.println(entiers[i]);
        }


    }
}

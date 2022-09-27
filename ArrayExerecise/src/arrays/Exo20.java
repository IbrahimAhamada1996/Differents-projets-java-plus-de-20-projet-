package arrays;

import java.util.Arrays;

public class Exo20 {

    public static void main(String[] args) {
        String[] chaine = new String[]{"ali","rara","tara","Ibrahim"};
        System.out.println("Before = " + Arrays.toString(chaine));

        for (int i = 0; i < chaine.length; i++) {
            for (int j = i+1; j < chaine.length; j++) {
                if (chaine[i].compareToIgnoreCase(chaine[j])<0){
                    String temp=chaine[i];
                    chaine[i]=chaine[j];
                    chaine[j]=temp;
                }
            }

        }
        System.out.println("After = " + Arrays.toString(chaine));

    }
}

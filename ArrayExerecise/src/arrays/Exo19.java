package arrays;

import java.util.Arrays;

public class Exo19 {

    public static void main(String[] args) {
        char[] characters = { 'a', 'c', 'p','g','y','a', 'm', 'o','t','q'};
        System.out.println(" Before\n = " + Arrays.toString(characters));
        for (int i = 0; i <characters.length ; i++) {
            for (int j = i+1; j <characters.length ; j++) {
                if(characters[i]<characters[j]){
                    char temp= characters[i];
                    characters[i]=characters[j];
                    characters[j]=temp;
                }
            }
        }

        System.out.println(" After sort an array of Characters descending\n = " + Arrays.toString(characters));
    }
}

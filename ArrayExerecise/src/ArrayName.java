import arrays.Exo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayName {
        /*
        les valeurs sont stocké dans stack et les objets sont stocké hip
        Ibrahim Ahamada M'sa
        Maimouna Sarr
        Elamaine Amadou
        Doudou Mane


         */
    public static void main(String[] args) {
        Exo1 exo1 = new Exo1();
        Exo1 exo2 = new Exo1();

        if (exo1.equals(exo2))
            System.out.println("egale");
        else
            System.out.println("don't egale");
        List<String> names  = new ArrayList<>(Arrays.asList("Abdou","Moussa","Diame","kalidou","Auguest","Penda","Alfred","Modou","Cheikh","Seynabou"));

        System.out.println("*********************************************************");
        String[] newNames = names.toArray(new String[names.size()]);
        // print the names in alphabetique order
        Arrays.sort(newNames);
        System.out.println("print the names in alphabetique order");
        System.out.println( newNames.toString());

        System.out.println("*********************************************************");
        //Find the position of name "Auguest"
        System.out.println("Find the position of name \"Auguest\"");
        System.out.println("the position of Auguest is "+names.indexOf("Auguest"));

        System.out.println("*********************************************************");
        //Verify if the ArrayList contains "Khady"
        System.out.println("Verify if the ArrayList contains \"Khady");
        if (names.contains("Khady"))
            System.out.println("the ArrayList contains \"Khady\"");
        else
            System.out.println("the ArrayList don't contains \"Khady\"");


        System.out.println("*********************************************************");
        //Remove the name "Penda"

         names.remove("Penda");
        System.out.println("After remove \"Penda\"");
        System.out.println( names.toString());

        System.out.println("*********************************************************");
        //Change the value of "Seynbou" to "Adji"
        names.set(names.indexOf("Seynabou"),"Adji");
        System.out.println("Change the value of \"Seynbou\" to \"Adji\"");
        System.out.println( names.toString());

        System.out.println("*********************************************************");
        //Add "Khady" between "Modou" and "Cheikh"
        names.add(names.indexOf("Modou")+1,"Khady");
        System.out.println("Add \"Khady\" between \"Modou\" and \"Cheikh\"");
        System.out.println( names.toString());


    }
}

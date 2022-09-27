package com.sarayatech;

import java.util.Arrays;

public class Exo1 {

    public static void main(String[] args) {
        String[] names = new String[] {"akkklkkkkkki", "kmn", "uu","SAmmmmmmmmmmmmRATF","kkkkkkkk","r"};
        String[] names1 = names;

        String temp1=names[2];
        names[2] = names[names.length-1];
        names[names.length-1]=temp1;
        System.out.println("**********************************************************");

        System.out.println("name to end table : "+names[names.length-1]);


        for (int i = 0; i < names.length; i++) {
            for (int j = i+1; j <names.length ; j++) {
                if (names[j].length() < names[i].length()){
                    String temp= names[i];
                    names[i] = names[j];
                    names[j] = temp;

                }
            }
        }
        System.out.println("**********************************************************");
        System.out.println("The longest name = " + names[names.length-1]);
        System.out.println("**********************************************************");
        String longestName="";
        for (String name:names
             ) {
            if (name.length()>longestName.length())
                longestName=name;

        }

        System.out.println("args = " + longestName);
    }
}

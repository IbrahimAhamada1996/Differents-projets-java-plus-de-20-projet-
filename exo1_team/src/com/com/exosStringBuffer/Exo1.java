package com.com.exosStringBuffer;

import java.util.Arrays;

public class Exo1 {

    public static void main(String[] args) {
        System.out.println("************************************************************");
        // EXO1
        StringBuilder stringBuilder = new StringBuilder("I'm from Comoros");

        if (stringBuilder.indexOf("Comoros") != -1) {
            System.out.println("The string contains  'Comoros' same a auther string" );
        }
        System.out.println("************************************************************");
        // EXO2
        StringBuffer stringBuffer = new StringBuffer("I'm from Comoros 0002");
        boolean findDigital=false;
        for (char c: stringBuffer.toString().toCharArray()
             ) {
            if (Character.isDigit(c)){
                findDigital=true;
                break;
            }
        }
        if (findDigital)
            System.out.println("conatains digitals");
        else
            System.out.println("don't conatains digitals");

        System.out.println("************************************************************");
        //EXO3

        StringBuffer s = new StringBuffer("I'm from Comoros");
        System.out.println("Before remove" );
        System.out.println(s.toString());
        if (stringBuilder.indexOf("Comoros") != -1) {
            s.delete(9,16);
        }
        System.out.println("After remove" );
        System.out.println(s.toString());
        System.out.println("************************************************************");

        //EX4
        StringBuffer sc = new StringBuffer("I'm from Comoros");
        System.out.println("We have "+sc.length()+" characters");
        System.out.println("************************************************************");
        //EXo5
        StringBuffer concat = new StringBuffer("I'm from Comoros I'm ");
        concat.append(16);
        System.out.println(concat.toString());

        //EX6
        String str = "I'm from Comoros, ok!";
        StringBuffer check = new StringBuffer(str);
       int chars =  check.toString().toCharArray().length;
        System.out.println("count character = " + chars);


    }
}

package com.stringbuffer;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("The drivensteals some gasolime");
        //on remplce tout les d par b, a par z
        //en suit on inverse l'ordre de la phrase en enlevant tout les "e" on les remplace par d

        while(stringBuilder.indexOf("e") != -1){
            stringBuilder.deleteCharAt(stringBuilder.indexOf("e"));
        }

        System.out.println("args = " +stringBuilder.toString() );
    }

}

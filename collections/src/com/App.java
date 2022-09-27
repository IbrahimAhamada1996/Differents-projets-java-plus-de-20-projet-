package com;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        String str = "I am going to tell you about my live";
        char[] chars = str.toCharArray();

        Map<Character,Integer> map = new LinkedHashMap<>();

        for (char c:chars
             ) {

            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }

        for (Map.Entry<Character, Integer> m:map.entrySet()
             ) {
            System.out.println(m.getKey()+"("+m.getValue()+")");
        }
    }
}

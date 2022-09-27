package com;

import com.sarayatech.Admin;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Admin admin1 = new Admin(111,"Karim");
        Admin admin2 = new Admin(2,"Ibrahim");
        Admin admin3 = new Admin(90,"Omar");
        Admin admin4 = new Admin(7,"Dieynaba");
        Admin admin5 = new Admin(10,"Ali");

        List<Admin> admins = new ArrayList<>(Arrays.asList(admin1,admin2,admin3,admin4,admin5));
        Collections.sort(admins);

        admins.stream().forEach(System.out::println);

        System.out.println("******************************************" );

        Collections.sort(admins,Admin.comparatorNom);
        admins.forEach(System.out::println);

        System.out.println("*****************LinkedList*************************" );
        List<Admin> etudiantSet = new LinkedList<>(Arrays.asList(admin1,admin2,admin3,admin4,admin5));
        etudiantSet.forEach(System.out::println);

        System.out.println("*****************HashSet*************************" );
        Set<Admin> etudiantHashTable =  new HashSet<>(Set.of(admin1,admin2,admin3,admin4,admin5));
        etudiantHashTable.forEach(System.out::println);

        System.out.println("*****************LinkedHashSet*************************" );
        Set<Admin> adminSet = new LinkedHashSet<>(Set.of(admin1,admin2,admin3,admin4,admin5));
        adminSet.forEach(System.out::println);

        System.out.println("*****************TreeSet*************************" );
        Set<Admin> treeSet = new TreeSet<>(Set.of(admin1,admin2,admin3,admin4,admin5));
        treeSet.forEach(System.out::println);
    }
}

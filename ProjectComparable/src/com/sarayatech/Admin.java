package com.sarayatech;

import java.util.Comparator;

public class Admin implements Comparable<Admin> {
    private int id;
    private String name;

    public Admin(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Admin that) {
        return Integer.compare(this.id,that.id);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

   public static Comparator<Admin> comparatorNom = new Comparator<Admin>() {
        @Override
        public int compare(Admin o1, Admin o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };

}

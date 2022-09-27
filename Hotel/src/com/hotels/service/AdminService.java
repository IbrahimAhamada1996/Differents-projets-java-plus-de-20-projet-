package com.hotels.service;

import com.hotels.model.users.Admin;

import java.util.ArrayList;
import java.util.List;

public class AdminService {
        public List<Admin> admins= new ArrayList<>();
    public void addAdmin( Admin admin){


       this.admins.add(admin);

    }

    public void showAdmin(){
        for (Admin admin :admins) {
            System.out.println("Admin:" +
                    "\nusername='" + admin.getUsername() + '\'' +
                    "\n firstname='" + admin.getFirstname()+ '\'' +
                    "\n lastname='" + admin.getLastname() + '\'' +
                    "\n email='" + admin.getEmail() + '\''
            );
        }
    }
}

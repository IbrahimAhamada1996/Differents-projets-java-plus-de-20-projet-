package com.park;

import com.park.materials.Computer;
import com.park.rooms.Room;
import com.park.users.Manager;
import com.park.users.User;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        Computer computer = new Computer("192.136.16.3","Lenovo","AR-PO5");
        Manager manager = new Manager("ibrahim","Ahamada","mballo",computer);
        Room room = new Room("Room1",45,manager);
        room.setNumberOfComputers(1);

        User user = new User("Sar","Omar",computer,5);

        computer.getInfo();
        manager.getInfo();
        room.getInfo();
        user.getInfo();
    }
}

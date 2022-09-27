package com.hotels.service;

import com.hotels.model.rooms.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomService {
    private List<Room> rooms= new ArrayList<>();

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(Room room){
        if (this.rooms.size()<3)
            this.rooms.add(room);

    }

    public void showRooms(){
        int i=0;
        for (Room room: rooms
        ) {

            System.out.println("\nRoom " + ++i +'\n'+
                    "\tRoom Number : " + room.getId() + '\n' +
                    "\tRoom Type : " + room.getTypeOfRomm() + '\n' +
                    "\tCapacity : " + room.getMaximCapacity() + '\n' +
                    "\tNumber Of Beds : " + room.getNumberOfBed()+ '\n' +
                    "\tprice=" + room.getPrice() + '\n' +
                    "\tstatus=" +( room.isStatus()?"Available":"Occupied")
            );
            System.out.println("................................................................");
        }
    }


}

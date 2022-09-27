package com.hotels.model.bookings;
import com.hotels.model.rooms.Room;
import com.hotels.model.users.Client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Booking {

    private int number;
    private Client client;
    private Room room;



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Booking:" +
                "number='" + number + '\'' +
                ", client=" + client.toString()+'\'' +
                ", room=" + room.toString() +
                '}';
    }

    public String generation(){

        LocalDate date = LocalDate.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("ddMMyyyy");

       return df.format(date)+"-"+ ++number;
    }
}

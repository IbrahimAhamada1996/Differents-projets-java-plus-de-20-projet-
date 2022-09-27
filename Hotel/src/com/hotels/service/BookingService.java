package com.hotels.service;

import com.hotels.model.bookings.Booking;
import com.hotels.model.users.Client;

import java.util.ArrayList;
import java.util.List;

public class BookingService {

    private List<Booking> bookings = new ArrayList<>();


    public void addBooking(int idRoom, Client client, RoomService roomService){
        Booking booking = new Booking();

        roomService.getRooms().get(idRoom-1);
        roomService.getRooms().get(idRoom-1).setStatus(false);
        booking.setRoom(roomService.getRooms().get(idRoom-1));
        booking.setClient(client);
        this.bookings.add(booking);
    }

    public void showBookings(){

        for (Booking booking: bookings
             ) {
            System.out.println(
                    "Number "+booking.generation()+"\n"+
                    "Client \n"+
                    "Fullname : "+booking.getClient().getFirstname()+" "+booking.getClient().getLastname()+" \n"+
                    "Address : "+booking.getClient().getAddress()+"\n"+
                     "Email : "+booking.getClient().getEmail()+"\n"+
                     "Phone number : "+booking.getClient().getPhoneNumber()+"\n"+
                    "Room \n"+
                    "Room Number : "+booking.getRoom().getId()+"\n"+
                    "Room Type : "+booking.getRoom().getTypeOfRomm()+"\n"+
                    "Capacity : "+booking.getRoom().getMaximCapacity()+"\n"+
                    "Number of bads : "+booking.getRoom().getNumberOfBed()+"\n"+
                    "Price : "+booking.getRoom().getPrice()+"\n"+
                    "Status : "+(booking.getRoom().isStatus()?"Available":"Occupied")+"\n"
            );
            System.out.println("......................................");

        }
    }

}

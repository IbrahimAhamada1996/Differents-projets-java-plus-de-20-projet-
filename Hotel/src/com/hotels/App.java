package com.hotels;

import com.hotels.model.rooms.Room;
import com.hotels.model.users.Admin;
import com.hotels.model.users.Client;
import com.hotels.service.AdminService;
import com.hotels.service.BookingService;
import com.hotels.service.RoomService;

import java.util.*;

public class App {
    private static Scanner sc;
    public static void main(String[] args) {
        AdminService adminService = new AdminService();
        RoomService roomService = new RoomService();
        BookingService bookingService = new BookingService();
        System.out.println("WELCOM TO SARAYA HOTEL");
            showMessage();


        sc = new Scanner(System.in);

            int  ch=0;
            while (ch!=1){
                System.out.print("Choose an option: ");

                ch = sc.nextInt();
                System.out.println("You have to create an Admin first");
                showMessage();
            }
            do{

                switch (ch){
                    case 1: {


                            System.out.println("Create A NEW ADMIN");
                            sc= new Scanner(System.in);
                            System.out.print("First name : " );
                            String firtname = sc.nextLine();

                            System.out.print("Last name : ");
                            String lastname = sc.nextLine();

                            System.out.print("Username : ");
                            String username = sc.nextLine();

                            System.out.print("Email: ");
                            String email = sc.nextLine();

                            Admin admin1 = new Admin(firtname,lastname,email,username);
                            adminService.addAdmin(admin1);
                            adminService.showAdmin();

                            showMessage();
                            System.out.print("Choose an option: ");
                           ch = sc.nextInt();
                    }
                    break;
                    case 2: {
                        showMessage();

                        System.out.println("CREATE A ROOM\n\t" +"Admin: \n");

                        sc= new Scanner(System.in);
                        System.out.print("Room id: ");
                        int id= sc.nextInt();
                        System.out.print("Maximun Capacity: ");
                        int maximCapacity = sc.nextInt();
                        System.out.print("Number of bed: ");
                        int numberOfBed = sc.nextInt();
                        System.out.print("Type of room: ");
                        String typeOfRoom = sc.next();
                        System.out.println("Price: ");
                        double price = sc.nextDouble();
                        Room room = new Room(id,maximCapacity,numberOfBed,typeOfRoom,price);
                        roomService.addRoom(room);
                        System.out.println( room.toString());
                        showMessage();

                        System.out.print("Choose an option: ");
                        ch = sc.nextInt();
                        System.out.print("First name");
                        String firstname = sc.nextLine();


                    }
                    break;
                    case 3:{
                        roomService.showRooms();
                        System.out.print("Choose an option: ");
                        ch = sc.nextInt();
                    }
                    break;
                    case 4:{
                        showMessage();

                        System.out.println("CLIENT : \n");
                        sc= new Scanner(System.in);
                        System.out.print("First name : " );
                        String firtname = sc.nextLine();

                        System.out.print("Last name : ");
                        String lastname = sc.nextLine();

                        System.out.print("Address : ");
                        String address = sc.nextLine();

                        System.out.print("Phone number : ");
                        String phoneNumber = sc.nextLine();

                        System.out.print("Email: ");
                        String email = sc.nextLine();
                        Client client = new Client(firtname,lastname,email,address,phoneNumber);



                        roomService.showRooms();

                        System.out.print("choose room: ");
                        int roomId = sc.nextInt();
                        if (roomService.getRooms().isEmpty()){
                            System.out.println("There is not room  ");
                        }else {
                            bookingService.addBooking(roomId,client,roomService);
                        }

                        showMessage();
                        System.out.print("Choose an option: ");
                        ch = sc.nextInt();
                    }
                    break;
                    case 5: {
                        bookingService.showBookings();
                        showMessage();
                        System.out.print("Choose an option: ");
                        ch = sc.nextInt();
                    }
                    break;

                    default:
                        System.out.println("GOOBYE");
                        System.exit(1);
                }
            }while( ch != 1);



    }

    public static void showMessage(){
        System.out.println(
                "1................................Add Admin\n"+
                "2.................................Add Room\n"+
                "3...............................Show Rooms\n"+
                "4..............................Add Booking\n"+
                "5............................Show Bookings\n"+
                "0.....................................Exit\n"
        );
    }



}

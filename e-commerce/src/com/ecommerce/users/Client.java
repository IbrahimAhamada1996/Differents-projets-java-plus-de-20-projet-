package com.ecommerce.users;

public class Client extends User{

    private   String address;

    public Client() {
    }

    public Client(String address) {
        this.address = address;
    }

    public Client(String firstname, String lastname, String address) {
        super(firstname, lastname);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void getInfo() {
        System.out.println("Client{" +
                "address='" + address + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}');
    }
}

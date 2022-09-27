package com.hotels.model.users;

public class Client  extends User{
    private String address;
    private String phoneNumber;

    public Client(String firstname, String lastname, String email, String address, String phoneNumber) {
        super(firstname, lastname, email);
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Client : " +'\n' +
                "\taddress : " + address + '\n' +
                "\tphoneNumber = " + phoneNumber + '\n' +
                "\tfirstname = " + firstname + '\n' +
                "\tlastname= " + lastname + '\n' +
                "\temail = " + email + '\n'
                ;
    }
}

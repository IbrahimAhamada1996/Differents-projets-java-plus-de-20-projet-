package com.hotels.model.users;

public class Admin extends User {

    private String username;

    public Admin() {
        super();

    }

    public Admin(String firstname, String lastname, String email, String username) {
        super(firstname, lastname, email);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Admin:" +
                "\t username=" + username + '\n' +
                "\t firstname='" + firstname + '\n' +
                "\t lastname='" + lastname + '\n' +
                "\t email='" + email + '\n'
                ;
    }
}

package com.ecommerce.users;

public class Admin extends User{
    private   String username;

    public Admin() {
    }

    public Admin(String username) {
        this.username = username;
    }

    public Admin(String firstname, String lastname, String username) {
        super(firstname, lastname);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void getInfo() {
        System.out.println( "Admin{" +
                "username='" + username + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}');
    }

    public void createOrder(){
        System.out.println("the Admin create the order\n");
    }

    public void createProduit(){
        System.out.println("the Admin create the produit\n");
    }

}

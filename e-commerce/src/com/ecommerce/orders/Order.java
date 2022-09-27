package com.ecommerce.orders;

import com.ecommerce.products.Product;
import com.ecommerce.users.Admin;
import com.ecommerce.users.Client;

public class Order {

    private Product product;
    private Client client;
    private Admin admin;

    public Order() {
    }

    public Order(Product product, Client client, Admin admin) {
        this.product = product;
        this.client = client;
        this.admin = admin;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public void getInfo() {
        System.out.println( "Order{" +
                "product=" + product +
                ", client=" + client +
                ", admin=" + admin +
                '}');
    }

    public void haveClient(){
        System.out.println("tan Order should have a client");
    }
}

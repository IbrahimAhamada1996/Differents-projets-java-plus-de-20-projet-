package com.ecommerce;

import com.ecommerce.orders.Order;
import com.ecommerce.products.Product;
import com.ecommerce.users.Admin;
import com.ecommerce.users.Client;

public class App {

    public static void main(String[] args) {

        Product product =new Product("Laptop",455500);
        product.getInfo();
        Admin admin = new Admin("SAra","Ali","Omar");
        admin.getInfo();
        Client client =new Client("SAra","Ali","Sam");
        client.getInfo();
        Order order = new Order(product,client,admin);
        order.getInfo();


    }
}

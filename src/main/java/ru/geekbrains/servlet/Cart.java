package ru.geekbrains.servlet;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("cart")
public class Cart {
    private Product product;
    private List<Product> cartProducts = new ArrayList<>();

    public void addProduct(int id) {
        if (product.getById(id) != null) {
            cartProducts.add(product.getById(id));

            System.out.println(product.getById(id).getTitle() + "added to cart.");
        } else {
            System.out.println("Wrong ID");
        }
    }

    public void showProducts() {
        cartProducts.
    }
}
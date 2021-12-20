package ru.geekbrains.Homework3.service;

import ru.geekbrains.Homework3.Product;

import java.util.List;

public interface ProductService {
    List<Product> allProducts();

    void saveSearch(Product product);

    Product getID(Integer id);
}

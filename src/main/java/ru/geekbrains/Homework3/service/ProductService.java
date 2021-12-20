package ru.geekbrains.Homework3.service;

import ru.geekbrains.Homework3.Product;

import java.util.List;

public interface ProductService {
    List<Product> allProducts();
    Product getID(int id);
}

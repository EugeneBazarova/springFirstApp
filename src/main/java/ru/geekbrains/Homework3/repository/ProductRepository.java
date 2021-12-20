package ru.geekbrains.Homework3.repository;

import ru.geekbrains.Homework3.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> allProducts();

    public Product getID(Integer id);

    void saveSearch(Product product);
}

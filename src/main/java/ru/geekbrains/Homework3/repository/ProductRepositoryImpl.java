package ru.geekbrains.Homework3.repository;

import ru.geekbrains.Homework3.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    private List<Product> productList = new ArrayList<>();

    public ProductRepositoryImpl() {

        productList.add(new Product(1, "Meat", 5));
        productList.add(new Product(2, "Egg", 2));
        productList.add(new Product(3, "Potato", 1));
        productList.add(new Product(4, "Lamb", 7));
        productList.add(new Product(5, "Bread", 9));
        productList.add(new Product(6, "Salt", 6));
        productList.add(new Product(7, "Sugar", 8));
        productList.add(new Product(8, "Oil", 1));
        productList.add(new Product(9, "Butter", 4));
        productList.add(new Product(10, "Garlic", 3));
    }

    public List<Product> allProducts() {
        return productList;
    }

    public Product getID(Integer id) {
        return productList.get(id);
    }

    public void saveSearch(Product product) {
        productList.add(product);
    }

}

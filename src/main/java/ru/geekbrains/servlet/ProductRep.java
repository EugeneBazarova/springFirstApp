package ru.geekbrains.servlet;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("productRep")
public class ProductRep {
    private List<Product> productList;

    public void initProductList() {
        productList = new ArrayList<>();
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

    public List<Product> getProductList() {
        return productList;
    }

    public Product findProductById(int id) {
        if (id < productList.size()) {
            return productList.stream()
                    .filter(p -> p.getId() == id)
                    .findFirst().orElseThrow(() ->
                            new RuntimeException());
        }
        return null;
    }
}
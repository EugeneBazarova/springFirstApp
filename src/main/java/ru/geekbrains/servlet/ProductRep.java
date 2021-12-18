package ru.geekbrains.servlet;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("productRep")
public class ProductRep {
    private List<Product> productList;
    private int id;

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

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getAll() {
        return productList;
    }
}
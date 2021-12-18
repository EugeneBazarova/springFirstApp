package ru.geekbrains.servlet;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("productRep")
public class ProductRep {
    private List<Product> productList;


    public List<Product> getProductList() {
        return productList;
    }


    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getAll() {
        return productList;
    }

    public Product getProductById(int id) {
        if (id > productList.size()) {
            System.out.println("Product not found.");
            return null;
        }
        return productList.get(id - 1);
    }

    public void printProductList() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
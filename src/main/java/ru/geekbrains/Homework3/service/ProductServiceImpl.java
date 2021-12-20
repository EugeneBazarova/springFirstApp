package ru.geekbrains.Homework3.service;

import ru.geekbrains.Homework3.Product;
import ru.geekbrains.Homework3.repository.ProductRepository;
import ru.geekbrains.Homework3.repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> allProducts() {
        return productRepository.allProducts();
    }

    @Override
    public Product getID(int id) {
        if (id != null) {
            return productRepository.getID(id);
        }
        return null;
    }
}

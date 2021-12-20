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
    public void saveSearch(Product product) {
        if (product != null) {
            List<Product> productList = productRepository.allProducts();
            if (!productList.isEmpty()) {
                Product curProducts = productList.get(productList.size() - 1);
                product.setId(curProducts.getId() + 1);
                productRepository.saveSearch(product);
            }
        }
    }

    @Override
    public Product getID(Integer id) {
        if (id != null) {
            return productRepository.getID(id);
        }
        return null;
    }
}

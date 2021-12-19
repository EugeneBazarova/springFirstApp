package ru.geekbrains.servlet;

public class Product {
    private int id;
    private String title;
    private int cost;

    private ProductRepository productRepository;

    public Product(int id, String title, int cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Product getById(int id) {
        return productRepository.findProductById(id);
    }
}
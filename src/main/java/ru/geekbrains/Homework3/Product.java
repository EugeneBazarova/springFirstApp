package ru.geekbrains.Homework3;

public class Product {
    private int id;
    private String title;
    private int cost;

    public Product(int id, String title, int cost) {

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId(int id) {
        return id;
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

    Override

    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        Product smth = (Product) object;
        if (id == null) {
            if (smth.id != null)
                return false;
        } else if (!id.equals(smth.id))
            return false;
    }
}
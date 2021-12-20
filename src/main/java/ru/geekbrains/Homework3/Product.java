package ru.geekbrains.Homework3;

public class Product {
    private Integer id;
    private String title;
    private Integer cost;

    public Product(Integer id, String title, Integer cost) {

    }

    public Product() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getId(Integer id) {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getCost(Integer cost) {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
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
        if (cost == null) {
            if (smth.cost != null)
                return false;
        } else if (!cost.equals(smth.cost))
            return false;
        if (title == null) {
            if (smth.title != null)
                return false;
        } else if (!title.equals(smth.title))
            return false;
        return true;
    }

}
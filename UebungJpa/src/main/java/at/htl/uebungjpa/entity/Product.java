package at.htl.uebungjpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "JP_PRODUCT")
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private
    Long id;

    private String name;
    private double price;
    private int amountInStock;
    private boolean available;

    //region Constructors
    public Product() {
    }

    public Product(String name, double price, int amountInStock) {
        this.name = name;
        this.price = price;
        this.amountInStock = amountInStock;
        this.available = true;
    }
    //endregion

    //region Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    //endregion
}

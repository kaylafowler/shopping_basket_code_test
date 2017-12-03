package models;

public class Product {
    private String name;
    private int id;
    private double price;
    private boolean buyonegetonefree;

    public Product(String name, int id, double price, boolean buyonegetonefree){
        this.name = name;
        this.id = id;
        this.price = price;
        this.buyonegetonefree = buyonegetonefree;
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBuyonegetonefree() {
        return buyonegetonefree;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBuyonegetonefree(boolean buyonegetonefree) {
        this.buyonegetonefree = buyonegetonefree;
    }
}





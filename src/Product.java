public class Product {
    private String name;
    private int id;
    private double price;
    private boolean discounted;
    private int origPrice;

    public Product(String name, int id, double price, boolean discounted){
        this.name = name;
        this.id = id;
        this.price = price;
        this.discounted = discounted;
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

    public boolean isDiscounted() {
        return discounted;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscounted(boolean discounted) {
        this.discounted = discounted;
    }
}





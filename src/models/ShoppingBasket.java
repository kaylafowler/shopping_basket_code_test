package models;

import java.util.ArrayList;
import java.util.Collections;

public class ShoppingBasket {
    private Stock stock;
    private ArrayList<Product> basket;

    public ShoppingBasket(Stock stock){
        this.basket = new ArrayList<>();
        this.stock = stock;
    }

    public int numOfProducts() {
       return basket.size();
    }

    // Can only products that are in-stock to shopping basket
    public void addProduct(Product product) throws Exception{
        if (stock.productInStock(product) == true) {
            basket.add(product);
            if(product.isBuyonegetonefree() == true){
                basket.add(product);
            }
        } else {
            throw new Exception("Item not in stock");
        }
    }

    public void removeProduct(Product product) {
        basket.remove(product);
    }

    public void emptyBasket() {
        basket.clear();
    }

    public double totalPriceOfProducts() {
        double total = 0;
        for(Product product: basket) {
            if(product.isBuyonegetonefree() == false){
            total += product.getPrice();}
            else {
                total += (product.getPrice() / 2 );}
        }
        return total;
    }

    public int numOfProductInBasket(Product product){
        int occurrences = Collections.frequency(basket,product);
        return occurrences;
    }

}







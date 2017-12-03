package models;

import java.util.ArrayList;
import java.util.Collections;

public class Stock {
    private ArrayList<Product> stockList;

    public Stock(ArrayList stockList){
        this.stockList = stockList;
    }

    public ArrayList<Product> getStockList() {
        return stockList;
    }

    public int numOfProducts() {
        return stockList.size();
    }

    public void addProduct(Product product) {
        stockList.add(product);
    }

    public void removeProduct(Product product) {
        stockList.remove(product);
    }

    public double totalPriceOfProducts() {
        double total = 0;

        for(Product product: stockList) {
            total += product.getPrice();
        }
        return total;
    }

    public int numOfProductInStock(Product product){
        int occurrences = Collections.frequency(stockList,product);
        return occurrences;
    }

    public void emptyStockList(){
        stockList.clear();
    }

    public boolean productInStock(Product product){
        return stockList.contains(product);
    }
}


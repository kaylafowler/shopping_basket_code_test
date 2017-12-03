package models;

import java.lang.reflect.Array;
import java.util.ArrayList;

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
}


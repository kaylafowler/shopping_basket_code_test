package tests;

import models.Product;
import models.Stock;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StockTest {
    Product leek;
    Product ham;
    Product merlot;
    Product shampoo;
    Stock stocklist;
    ArrayList<Product> products;


    @Before
    public void before(){
        leek = new Product("Organic Leek", 212, 00.90, false);
        ham = new Product("Smoked Ham",124, 9.59, true);
        merlot = new Product("Merlot", 456, 8.99, false);
        shampoo = new Product("Pantene Volume Shampoo", 843, 2.75, true);
        products = new ArrayList<Product>();
        products.add(leek);
        products.add(ham);
        products.add(merlot);
        products.add(shampoo);
        stocklist = new Stock(products);
    }

    @Test
    public void canGetStocklistLength(){
        int expected = stocklist.numOfProducts();
        assertEquals(expected, 4);
    }

    @Test
    public void canAddProduct(){
        stocklist.addProduct(merlot);
        int expected = stocklist.numOfProducts();
        assertEquals(expected, 5);
    }

    @Test
    public void canRemoveProduct(){
        assertEquals(4, stocklist.numOfProducts());
        stocklist.removeProduct(ham);
        int expected = stocklist.numOfProducts();
        assertEquals(expected, 3);
    }

    @Test
    public void canSumAllPrices(){
        double expected = stocklist.totalPriceOfProducts();
        assertEquals(expected, 22.23, 0.01);
    }

    @Test
    public void canGetFrequencyOfEachProduct(){
        stocklist.addProduct(leek);
        int expected = stocklist.numOfProductInStock(leek);
        assertEquals(expected, 2);
    }

    @Test
    public void canEmptyStockList(){
        assertEquals(4, stocklist.numOfProducts());
        stocklist.emptyStockList();
        int expected = stocklist.numOfProducts();
        assertEquals(expected, 0);
    }

    @Test
    public void canReturnTrueIfProductInStock(){
        boolean expected = stocklist.productInStock(leek);
        assertEquals(expected, true);

    }

    @Test
    public void canReturnFalseIfProductNotInStock(){
        Product pepper;
        pepper = new Product("Red Pepper", 515, 00.80, false);
        boolean expected = stocklist.productInStock(pepper);
        assertEquals(expected, false);
    }
}

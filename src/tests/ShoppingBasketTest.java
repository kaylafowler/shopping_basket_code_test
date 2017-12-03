package tests;

import models.Product;
import models.ShoppingBasket;
import models.Stock;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    ShoppingBasket basket;
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
        basket = new ShoppingBasket(stocklist);
    }

    @Test
    public void basketStartsEmpty(){
        int expected = basket.numOfProducts();
        assertEquals(expected, 0);
    }

    @Test
    public void canAddProductToBasket() throws Exception {
        basket.addProduct(shampoo);
        int expected = basket.numOfProducts();
        assertEquals(expected, 1);
    }

    @Test(expected = Exception.class)
    public void cannotAddOutOfStockProductToBasket() throws Exception {
        Product pepper = new Product("Red Pepper",45, 00.90, false);
        basket.addProduct(pepper);
    }

    @Test
    public void canRemoveProductFromBasket() throws Exception {
        basket.addProduct(shampoo);
        int expected1 = basket.numOfProducts();
        assertEquals(expected1, 1);
        basket.removeProduct(shampoo);
        int expected2 = basket.numOfProducts();
        assertEquals(expected2, 0);
    }

    @Test
    public void canEmptyBasket() throws Exception {
        basket.addProduct(merlot);
        basket.addProduct(ham);
        int expected1 = basket.numOfProducts();
        assertEquals(expected1, 2);
        basket.emptyBasket();
        int expected2 = basket.numOfProducts();
        assertEquals(expected2, 0);
    }

    @Test
    public void canGetSumOfProductPricesInBaset() throws Exception {
        basket.addProduct(ham);
        basket.addProduct(merlot);
        double expected = basket.totalPriceOfProducts();
        assertEquals(expected, 18.58, 0.01);

    }

    @Test
    public void canGetFrequencyOfEachProduct() throws Exception {
        basket.addProduct(leek);
        basket.addProduct(leek);
        basket.addProduct(leek);
        int expected = basket.numOfProductInStock(leek);
        assertEquals(expected, 3);
    }

}

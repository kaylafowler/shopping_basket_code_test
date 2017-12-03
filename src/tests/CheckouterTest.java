package tests;

import models.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CheckouterTest {
    Product leek;
    Product ham;
    Product merlot;
    Product shampoo;
    ArrayList<Product> products;
    Stock stocklist;
    ShoppingBasket shoppingBasket;
    Checkouter checkout;
    Checkouter checkout2;
    Customer customer;
    Customer customer2;


    @Before
    public void before() throws Exception {
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
        shoppingBasket = new ShoppingBasket(stocklist);
        shoppingBasket.addProduct(leek);
        shoppingBasket.addProduct(ham);
        customer = new Customer("Cooper Fowler", 7364, true);
        customer2 = new Customer("Ryan Glenn", 34455, false);
        checkout = new Checkouter(shoppingBasket, customer, stocklist);
        checkout2 = new Checkouter(shoppingBasket, customer2, stocklist);
    }

    @Test
    public void checkBasketTotalUnder20DoesNotApplyDiscount(){
        double expected = checkout.updatedBasketTotalPriceAfterGeneralDiscount();
        assertEquals(expected, 10.49, 0.01);
    }

    @Test
    public void checkBasketTotalOver20AppliesDiscount() throws Exception{
        shoppingBasket.addProduct(ham);
        double expected = checkout.updatedBasketTotalPriceAfterGeneralDiscount();
        assertEquals(expected, 18.07, 0.01);
    }

    @Test
    public void checkLoyaltyMembershipAppliesFurtherDiscount(){
        double expected = checkout.updatedBasketTotalPriceAfterLoyaltyDiscount();
        assertEquals(expected, 10.28, 0.01);
    }

    @Test
    public void checkLoyalyMembershipNotAppliedIfCustomerNotMember(){
        double expected = checkout2.updatedBasketTotalPriceAfterLoyaltyDiscount();
        assertEquals(expected, 10.49, 0.01);
    }

}

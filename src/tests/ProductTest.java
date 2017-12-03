package tests;

import models.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class ProductTest {

    Product leek;
    Product ham;
    Product merlot;
    Product shampoo;

    @Before
    public void before(){
        leek = new Product("Organic Leek", 212, 00.90, false);
        ham = new Product("Smoked Ham",124, 9.59, true);
        merlot = new Product("Merlot", 456, 8.99, false);
        shampoo = new Product("Pantene Volume Shampoo", 843, 2.75, true);
    }

    @Test
    public void canGetName(){
        Assert.assertEquals("Organic Leek", leek.getName());
    }

    @Test
    public void canGetId(){
        Assert.assertEquals(456, merlot.getId());
    }

    @Test
    public void canGetPrice(){
        Assert.assertEquals(2.75, shampoo.getPrice(), 0.01);
    }

    @Test
    public void checkIfProductIsBuyOneGetOneFree(){
        Assert.assertEquals(true, ham.isBuyonegetonefree());
        Assert.assertEquals(false, merlot.isBuyonegetonefree());
    }

    @Test
    public void canSetName(){
        merlot.setName("Trivento Argentinian Merlot");
        Assert.assertEquals("Trivento Argentinian Merlot", merlot.getName());
    }

    @Test
    public void canSetPrice(){
        leek.setPrice(00.60);
        Assert.assertEquals(00.60, leek.getPrice(), 0.01);
    }

    @Test
    public void canSetBuyOneGetOneFree(){
        ham.setBuyonegetonefree(false);
        Assert.assertEquals(false, ham.isBuyonegetonefree());

    }
}

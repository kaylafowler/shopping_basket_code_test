package tests;

import models.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer1;
    Customer customer2;

    @Before
    public void before(){
        customer1 = new Customer("Cooper Fowler", 12345, true);
        customer2 = new Customer("Andrew English", 54321, false);
    }

    @Test
    public void canGetName(){
       String expected = customer1.getName();
       assertEquals(expected, "Cooper Fowler");
    }

    @Test
    public void canSetName(){
        customer2.setName("Andrew Scottish");
        String expected = customer2.getName();
        assertEquals(expected, "Andrew Scottish");
    }

    @Test
    public void canGetId(){
        int expected = customer1.getId();
        assertEquals(expected, 12345);
    }

    @Test
    public void isLoyaltyMember(){
        boolean expected = customer2.getLoyaltyMember();
        assertEquals(expected, false);
    }

    @Test
    public void canSetLoyaltyMember(){
        customer2.setLoyaltyMember(true);
        boolean expected = customer2.getLoyaltyMember();
        assertEquals(expected, true);
    }
}

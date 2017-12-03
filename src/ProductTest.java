import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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
        assertEquals("Organic Leek", leek.getName());
    }

    @Test
    public void canGetId(){
        assertEquals(456, merlot.getId());
    }

    @Test
    public void canGetPrice(){
        assertEquals(2.75, shampoo.getPrice(), 0.01);
    }

    @Test
    public void isDiscounted(){
        assertEquals(true, ham.isDiscounted());
        assertEquals(false, merlot.isDiscounted());
    }

    @Test
    public void canSetName(){
        merlot.setName("Trivento Argentinian Merlot");
        assertEquals("Trivento Argentinian Merlot", merlot.getName());
    }

    @Test
    public void canSetPrice(){
        leek.setPrice(00.60);
        assertEquals(00.60, leek.getPrice(), 0.01);
    }

    @Test
    public void canSetDiscounted(){
        ham.setDiscounted(false);
        assertEquals(false, ham.isDiscounted());

    }
}

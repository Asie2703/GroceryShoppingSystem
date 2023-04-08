/**
 * ProductFactoryTest.java
 * This is a test class for product factory class
 * @author Asive Sibeko 219475296
 * 03 April 2023
 */

package factory;

import domain.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class ProductFactoryTest {
    private Product prod1;
    private Product prod2;
    private Product prod3;
    @BeforeEach
    void setUp() {
        prod1 = new Product();
        prod2 = new Product();
        prod3 = prod1;
    }
    @Test
    public void test(){
        Product product = ProductFactory.createProduct( 10, "Meat", "Bread", "Sasko");
        System.out.println(product.toString());
        assertNotNull(product);
    }

    @Test
    void testEquality(){
        assertEquals(prod1,prod3);
    }

    @Test
    void testIdentity(){
        assertSame(prod1,prod3);
    }
    @Test
    void testFail(){
        assertEquals(prod1,prod2);
    }

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void testTimeout() {
        System.out.println("Timeout has passed");
    }

    @Test
    @Disabled("Disabled until bug #42 has been resolved")

    void testWillBeSkipped() {
    }

}
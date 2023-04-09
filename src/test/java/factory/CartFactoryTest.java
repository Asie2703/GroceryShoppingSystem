/*
  * CartFactoryTest.java
  * This is my test for cart factory
  * @author Mthandeni Mbobo - 218223579
  * April 2023
*/

package factory;

import domain.Cart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CartFactoryTest {
    private Cart cart1;
    private Cart cart2;
    private Cart cart3;

    @BeforeEach
    void setUp() {
        cart1 = new Cart();
        cart2 = new Cart();
        cart3 = cart1;
    }
    @Test
    public void test(){
        Cart cart = CartFactory.createCart( 10, 25.00, 2, 50.00);
        System.out.println(cart.toString());
        assertNotNull(cart);
    }

    @Test
    void testEquality(){
        assertEquals(cart1,cart3);
    }

    @Test
    void testIdentity(){
        assertSame(cart1,cart3);
    }
    @Test
    void testFail(){
        assertEquals(cart1,cart2);
    }

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void testTimeout() {
        System.out.println("Timeout has passed");
    }

    @Test
    @Disabled("Test is disabled")

    void testWillBeSkipped() {
    }
}
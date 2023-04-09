/*
 * PaymentFactoryTest.java
 * This is my test for payment factory
 * @author Mthandeni Mbobo - 218223579
 * April 2023
 */
package factory;

import domain.Cart;
import domain.Payment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PaymentFactoryTest {
    private Payment pay1;
    private Payment pay2;
    private Payment pay3;

    @BeforeEach
    void setUp() {
        pay1 = new Payment();
        pay2 = new Payment();
        pay3 = pay1;
    }
    @Test
    public void test(){
        Payment payment = PaymentFactory.createPayment( 1, 2, "EFT", 50.00, true);
        System.out.println(payment.toString());
        assertNotNull(payment);
    }

    @Test
    void testEquality(){
        assertEquals(pay1,pay2);
    }

    @Test
    void testIdentity(){
        assertSame(pay1,pay3);
    }
    @Test
    void testFail(){
        assertEquals(pay1,pay2);
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
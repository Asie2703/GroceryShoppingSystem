/**
 * AdminFactoryTest.java
 * This is a test class for AdminFactory entity
 *
 * @author Anathi Mhlom 220006695
 * 07 April 2023
 */
package factory;

import domain.Admin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class AdminFactoryTest {
    private Admin admin1;
    private Admin admin2;
    private Admin admin3;

    @BeforeEach
    void setUp() {
        admin1 = new Admin();
        admin2 = new Admin();
        admin3 = admin1;
    }

    @Test
    public void test() {
        Admin admin = AdminFactory.createAdmin("Tati", "Richflexbaybay!", "tatiflex@gmail.com", "0763265478");
        System.out.println(admin.toString());
        assertNotNull(admin);
    }

    @Test
    void testEquality() {
        assertEquals(admin1, admin3);
    }

    @Test
    void testIdentity() {
        assertSame(admin1, admin3);
    }

    @Test
    void testFail() {
        assertEquals(admin1, admin2);
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
    void testTimeout() {
        System.out.println("Timeout has passed");
    }

    @Test
    @Disabled("Test is disabled")
    void testDisabled() {

    }
}

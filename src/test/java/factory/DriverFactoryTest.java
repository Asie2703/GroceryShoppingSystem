package factory;

/**
* DriverFactoryTest.java
* @author: Gilberto Silva (218239300)
* Date: 08 April 2023
*/

import domain.Driver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class DriverFactoryTest {

    private Driver driver1;
    private Driver driver2;
    private Driver driver3;

    @BeforeEach
    void setUp(){
    driver1 = new Driver();
    driver2 = new Driver();
    driver3 = driver1;
    }

    @Test
    public void test(){
        Driver driver = DriverFactory.createDriver("ABC0001", "Nicolau", "Sanchez", 987654321, "Toyota Etios, White, CAA 54321", 0625434565, "nicolauSanchez91@gmail.com");
        System.out.println(driver.toString());
        assertNotNull(driver);
    }
    @Test
    void testEquality(){assertEquals(driver1, driver3);}

    @Test
    void testIdentity(){assertSame(driver1,driver3);}

    @Test
    void testFail(){assertEquals(driver1, driver2);}

    @Test
    @Timeout(value = 10000, unit = TimeUnit.MILLISECONDS)
    void testTimeout(){System.out.println("Time has passed");}

    @Test
    @Disabled("Disabled ERROR 808 ")

    void testWillBeSkipped(){}
}
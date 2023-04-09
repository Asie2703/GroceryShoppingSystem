package repository;

/**
 * DriverRepositoryTest.java
 * @author: Gilberto Silva (218239300)
 * Date: 09 April 2023
 */

import domain.Driver;
import factory.DriverFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class DriverRepositoryTest {

    private static DriverRepository driverRepository = DriverRepository.getRepository();
    private static Driver driver = DriverFactory.createDriver("ABC0001", "Jonh", "Alonso", 98765432, "Whithe, Polo, CAA24234342", 0732334532, "jonhAlonso90@gmail.com");

    @Test
    void a_create() {
        Driver created = driverRepository.create(driver);
        assertEquals(driver.getDriver_ID(), created.getDriver_ID());
        System.out.println("Create" + created);
    }

    @Test
    void b_read() {
        Driver read = driverRepository.read(driver.getDriver_ID());
        assertNotNull(read);
        System.out.println("Read: "+ read);
    }

    @Test
    void c_update() {
        Driver updated = new Driver.Builder().copy(driver).setDriver_ID("ABC7234213")
                .setFirst_Name("Alisson")
                .setLast_Name("Becker")
                .setDriver_License_Number(232332323)
                .setVehicle_Information("White, Corolla, CAA232 323")
                .setPhone_Number(032323)
                .setEmail("alissonB@gmail.com")
                .build();
        assertNotNull(driverRepository.update(updated));
        System.out.println("Updated" + updated);
    }

    @Test
    void d_delete() {
        boolean success = driverRepository.delete(driver.getDriver_ID());
        assertTrue(success);
        System.out.println("Deleted" + success);
    }
    @Test
    void e_getAll() {
        System.out.println("Show all: ");
        System.out.println(driverRepository.getAll());
    }
}
/**
 * AdminRepositoryTest.java
 * This is a Repository test class for Admin entity
 *
 * @author Anathi Mhlom 220006695
 * 08 April 2023
 */
package repository;

import domain.Admin;
import factory.AdminFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdminRepositoryTest {
    private static AdminRepository adminRepo = AdminRepository.getAdminRepo();
    private static Admin admin = AdminFactory.createAdmin("Khaya", "Redrubydasleeze!", "khaya1@yahoo.com", "0789523654");

    @Test
    void a_create() {
        Admin adminCreate = adminRepo.create(admin);
        assertEquals(admin.getAdminId(), adminCreate.getAdminId());
        System.out.println("Created: " +adminCreate);
    }

    @Test
    void b_read() {
        Admin adminRead = adminRepo.read(admin.getAdminId());
        assertNotNull(adminRead);
        System.out.println("Read: " +adminRead);
    }

    @Test
    void c_update() {
        Admin adminUpdate = new Admin.Builder()
                .builder(admin)
                .setAdminName("Linda")
                .setAdminPassword("Transformer1")
                .setAdminEmail("linda1@outlook.com")
                .setAdminPhone("0736598745")
                .build();
        assertNotNull(adminUpdate);
        System.out.println("Updated: " +adminUpdate);
    }

    @Test
    void d_delete() {
        boolean adminDelete = adminRepo.delete(admin.getAdminId());
        assertTrue(adminDelete);
        System.out.println("Deleted: " +adminDelete);
    }

    @Test
    void e_getAll() {
        System.out.println("Show all: ");
        System.out.println(adminRepo.getAll());
    }
}

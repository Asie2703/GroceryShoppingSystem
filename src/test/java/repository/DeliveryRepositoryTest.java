/**
 * DeliveryRepository.java
 * This is a repository test class for Delivery entity
 * @author Nomta Mquqo 217296580
 * 08 April 2023
 */

package repository;

import domain.Delivery;
import factory.DeliveryFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class DeliveryRepositoryTest {

    private static DeliveryRepository repository = DeliveryRepository.getRepository();
    private static Delivery delivery = DeliveryFactory.create("31 street", null, "Tom mathea","truck",null);
    @Test
    void a_create() {
        Delivery created = repository.create(delivery);
        assertEquals(delivery.getId(), created.getId());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read() {
        Delivery read = repository.read(delivery.getId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Delivery updated = new Delivery.Builder().copy(delivery).setAddress("second delivery address")
                .setDescription("second delivery")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(order.getId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all:");
        System.out.println(repository.getAll());
    }
}
/**
 * OrderRepository.java
 * This is a repository test class for Order entity
 * @author Nomta Mquqo 217296580
 * 08 April 2023
 */

package repository;

import domain.Order;
import factory.OrderFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class OrderRepositoryTest {

    private static OrderRepository repository = OrderRepository.getRepository();
    private static Order order = OrderFactory.create("order1", "grocery", "food items",null);
    @Test
    void a_create() {
        Order created = repository.create(order);
        assertEquals(order.getId(), created.getId());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read() {
        Order read = repository.read(order.getId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Order updated = new Order.Builder().copy(order).setOrderNumber("0rder2")
                .setDescription("second order")
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
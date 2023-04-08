/**
 * StoreRepository.java
 * This is a repository test class for Store entity
 * @author Asive Sibeko 219475296
 * 08 April 2023
 */

package repository;

import domain.Store;
import factory.StoreFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class StoreRepositoryTest {

    private static StoreRepository repository = StoreRepository.getRepository();
    private static Store store = StoreFactory.createStore("Shoprite", "Woodstock", "Retail store");
    @Test
    void a_create() {
        Store created = repository.create(store);
        assertEquals(store.getStoreId(), created.getStoreId());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read() {
        Store read = repository.read(store.getStoreId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Store updated = new Store.Builder().copy(store).setStoreName("Pick n Pay")
                .setStoreAddress("Cape Town")
                .setStoreDescription("Retail store")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(store.getStoreId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all:");
        System.out.println(repository.getAll());
    }
}
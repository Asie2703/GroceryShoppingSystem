/**
 * ProductRepositoryTest.java
 * This is a repository test class for Product entity
 * @author Asive Sibeko 219475296
 * 08 April 2023
 */

package repository;

import domain.Product;
import domain.Store;
import factory.ProductFactory;
import factory.StoreFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class ProductRepositoryTest {

    private static ProductRepository repository = ProductRepository.getRepository();
    private static Product product = ProductFactory.createProduct(5, "Dairy", "Yoghurt", "Parmalat");
    @Test
    void a_create() {
        Product created = repository.create(product);
        assertEquals(product.getProductId(), created.getProductId());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read() {
        Product read = repository.read(product.getProductId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Product updated = new Product.Builder().copy(product).setProductNum(5)
                .setProductType("Dairy")
                .setProductItem("Yoghurt")
                .setProductDescription("Parmalat")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(product.getProductId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all:");
        System.out.println(repository.getAll());
    }
}
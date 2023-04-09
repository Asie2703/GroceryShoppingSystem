/**
 * CategoryRepositoryTest.java
 * This is a repository test class for Category entity
 * @author Sinentlahla Pindani 219081328
 * 08 April 2023
 */
package repository;

import domain.Category;
import domain.Product;
import factory.CategoryFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class CategoryRepositoryTest {
    private static CategoryRepository repository = CategoryRepository.getRepository();
    private static Category category = CategoryFactory.createCategory("Fruit","Apple" );
    @Test
    void a_create() {
        Category created = repository.create(category) ;
        assertEquals(category.getCategoryId(), created.getCategoryId());
        System.out.println("Create:" + created);

    }

    @Test
    void b_read() {
        Category read= repository.read(category.getCategoryId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Category updated = new Category.Builder().copy(category)
                .setCategoryName("Meat")
                .setCategoryType("Chichen")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated:" + updated);

    }

    @Test
    void e_delete() {
        boolean success = repository.delete(category.getCategoryId());
        assertTrue(success);
        System.out.println("Deleted:" + success);

    }

    @Test
    void d_getAll() {

        System.out.println("Show all:" );
        System.out.println(repository.getAll());
    }
}
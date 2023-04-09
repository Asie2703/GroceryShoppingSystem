/**
 * UserRepositoryTest.java
 * This is a Repository test class for User entity
 *
 * @author Anathi Mhlom 220006695
 * 08 April 2023
 */
package repository;
import domain.User;
import factory.UserFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class UserRepositoryTest {
    private static UserRepository userRepo = UserRepository.getUserRepo();
    private static User user = UserFactory.createUser("Nathi", "20 Rich Flex Street", "khaya1@yahoo.com", "0786253459");

    @Test
    void a_create() {
        User userCreate = userRepo.create(user);
        assertEquals(user.getUserId(), userCreate.getUserId());
        System.out.println("Created: " +userCreate);
    }

    @Test
    void b_read() {
        User userRead = userRepo.read(user.getUserId());
        assertNotNull(userRead);
        System.out.println("Read: " +userRead);
    }

    @Test
    void c_update() {
        User userUpdate = new User.Builder()
                .builder(user)
                .setUserName("Nathi")
                .setUserAddress("15 Khwezi Road")
                .setUserEmail("baybay2@live.com")
                .setUserPhone("0723456985")
                .build();
        assertNotNull(userUpdate);
        System.out.println("Updated: " +userUpdate);
    }

    @Test
    void d_delete() {
        boolean userDelete = userRepo.delete(user.getUserId());
        assertTrue(userDelete);
        System.out.println("Deleted: " +userDelete);
    }

    @Test
    void e_getAll() {
        System.out.println("Show all: ");
        System.out.println(userRepo.getAll());
    }
}

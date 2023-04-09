/**
 * UserRepository.java
 * This is a Repository class for User entity
 *
 * @author Anathi Mhlom 220006695
 * 08 April 2023
 */
package repository;

import domain.User;

import java.util.HashSet;
import java.util.Set;

public class UserRepository implements IUserRepository{
    private static UserRepository userRepo = null;
    private Set<User> userSet = null;
    private UserRepository() {
        userSet = new HashSet<User>();
    }

    public static UserRepository getUserRepo() {
        if (userRepo == null) {
            userRepo = new UserRepository();
        }
        return userRepo;
    }

    @Override
    public User create(User user) {
        boolean success = userSet.add(user);
        if (!success)
            return null;
        return user;
    }

    @Override
    public User read(String userId) {
        User user = userSet.stream()
                .filter(a -> a.getUserId().equals(userId))
                .findAny()
                .orElse(null);
        return user;
    }

    @Override
    public User update(User user) {
        User oldUser = read(user.getUserId());
        if (oldUser != null) {
            userSet.remove(oldUser);
            userSet.add(user);
            return user;
        }
        return null;
    }

    @Override
    public boolean delete(String userId) {
        User userDelete = read(userId);
        if (userDelete == null)
            return false;
        userSet.remove(userDelete);
        return true;
    }

    @Override
    public Set<User> getAll() {
        return userSet;
    }
}

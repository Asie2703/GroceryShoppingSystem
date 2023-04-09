/**
 * IUserRepository.java
 * This is a Repository interface for User entity
 *
 * @author Anathi Mhlom 220006695
 * 08 April 2023
 */
package repository;

import domain.User;

import java.util.Set;

public interface IUserRepository extends IRepository<User, String> {
    public Set<User> getAll();
}

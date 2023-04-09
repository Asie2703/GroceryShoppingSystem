/**
 * ICategoryRepository.java
 * This is a repository interface for Category class
 * @author Sinentlahla Pindani 219081328
 * 08 April 2023
 */
package repository;

import domain.Category;


import java.util.Set;

public interface ICategoryRepository extends IRepository<Category, String>{
    public Set<Category> getAll();
}

/**
 * IProductRepository.java
 * This is a repository interface for Product entity
 * @author Asive Sibeko 219475296
 * 08 April 2023
 */

package repository;

import domain.Product;
import domain.Store;

import java.util.Set;

public interface IProductRepository extends IRepository<Product, String>{

    public Set<Product> getAll();
}

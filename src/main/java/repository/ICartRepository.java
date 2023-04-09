/*
 * ICartRepository.java
 * This is my repository class (interface) for cart
 * @author Mthandeni Mbobo - 218223579
 * April 2023
 */

package repository;

import domain.Cart;

import java.util.Set;

public interface ICartRepository extends IRepository<Cart, String>{

    public Set<Cart> getAll();
}

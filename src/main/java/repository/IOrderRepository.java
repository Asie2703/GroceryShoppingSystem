/**
 * OrderRepository.java
 * This is a repository interface for Order entity
 * @author Nomta Mquqo 217296580
 * 08 April 2023
 */

package repository;

import domain.Order;

import java.util.Set;

public interface IOrderRepository extends IRepository<Order, String>{

    public Set<Order> getAll();


}


/**
 * OrderRepository.java
 * This is a repository class for Order entity
 * @author Nomta Mquqo 217296580
 * 08 April 2023
 */
package repository;

import domain.Order;

import java.util.HashSet;
import java.util.Set;

public class OrderRepository implements IOrderRepository{

    private static OrderRepository repository = null;
    private Set<Order> orderDB = null;

    private OrderRepository(){
        orderDB = new HashSet<Order>();
    }
    public static OrderRepository getRepository(){
        if (repository == null){
            repository = new OrderRepository();
        }
        return repository;
    }
    @Override
    public Order create(Order order) {
        boolean success = orderDB.add(order);
        if (!success)
            return null;
        return order;

    }

    @Override
    public Order read(String orderId) {
        Order order = orderDB.stream()
                .filter(s -> s.getId().equals(orderId))
                .findAny()
                .orElse(null);
        return order;
    }

    @Override
    public Order update(Order order) {

        Order oldOrder = read(order.getId());
        if (oldOrder != null){
            orderDB.remove(oldOrder);
            orderDB.add(order);
            return order;
        }
        return null;

    }

    @Override
    public boolean delete(String orderId) {
        Order orderToDelete = read(orderId);
        if (orderToDelete == null)
            return false;
        orderDB.remove(orderToDelete);
                return true;
    }

    @Override
    public Set<Order> getAll() {

        return orderDB;
    }
}

package factory;

import domain.Customer;
import domain.Order;

public class OrderFactory {
    //    create Order using Builder
    public static Order create(int id, String orderNumber, String type, String description,Customer customer){

        Order order =  new Order.Builder()
                .orderId(id)
                .orderNumber(orderNumber)
                .typeOfOrder(type)
                .descriptionOfOrder(description)
                .customer(customer)
                .build();

        return order;
    }
}

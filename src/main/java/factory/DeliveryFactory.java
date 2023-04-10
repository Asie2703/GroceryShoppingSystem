
/**
 * DeliveryFactory.java
 * This is a factory class for delivery entity
 * @author Nomta Mquqo 217296580
 * 04 April 2023
 */
package factory;

import domain.Customer;
import domain.Delivery;
import domain.Order;
import util.Helper;

import java.util.Date;

public class DeliveryFactory {
//    create Delivery using Builder
    public static Delivery create(String address, Date deliveryDate, String deliveredBy,String description,String type,Customer customer){
        
                if (Helper.isNullorEmpty(address) || Helper.isNullorEmpty(deliveryDate))
            return null;
        ;
        String id = Helper.generateId();
        Delivery delivery =  new Delivery.Builder()
                .deliveryId(id)
                .deliveryAddress(address)
                .dateOfDelivery(deliveryDate)
                .deliveredBy(deliveredBy)
                .descriptionOfDelivery(description)
                .typeOfDelivery(type)
                .customer(customer)
                .build();

        return delivery;
    }
}

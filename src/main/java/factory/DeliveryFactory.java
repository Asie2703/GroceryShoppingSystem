package factory;

import domain.Customer;
import domain.Delivery;
import domain.Order;

import java.util.Date;

public class DeliveryFactory {
//    create Delivery using Builder
    public static Delivery create(int id, String address, Date deliveryDate, String deliveredBy,String description,String type,Customer customer){
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

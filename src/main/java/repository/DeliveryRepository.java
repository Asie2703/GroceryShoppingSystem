
/**
 * DeliveryRepository.java
 * This is a repository class for Delivery entity
* @author Asive Sibeko 219475296
 * 08 April 2023
 */
package repository;

import domain.Delivery;

import java.util.HashSet;
import java.util.Set;

public class DeliveryRepository implements IDeliveryRepository{

    private static DeliveryRepository repository = null;
    private Set<Delivery> deliveryDB = null;

    private DeliveryRepository(){
        deliveryDB = new HashSet<Delivery>();
    }
    public static DeliveryRepository getRepository(){
        if (repository == null){
            repository = new DeliveryRepository();
        }
        return repository;
    }
    @Override
    public Delivery create(Delivery delivery) {
        boolean success = deliveryDB.add(delivery);
        if (!success)
            return null;
        return delivery;

    }

    @Override
    public Delivery read(String deliveryId) {
        Delivery delivery = deliveryDB.stream()
                .filter(s -> s.getId().equals(deliveryId))
                .findAny()
                .orElse(null);
        return delivery;
    }

    @Override
    public Delivery update(Delivery delivery) {

        Delivery oldDelivery = read(delivery.getId());
        if (oldDelivery != null){
            deliveryDB.remove(oldDelivery);
            deliveryDB.add(delivery);
            return delivery;
        }
        return null;

    }

    @Override
    public boolean delete(String deliveryId) {
        Delivery deliveryToDelete = read(deliveryId);
        if (deliveryToDelete == null)
            return false;
        deliveryDB.remove(deliveryToDelete);
                return true;
    }

    @Override
    public Set<Delivery> getAll() {

        return deliveryDB;
    }
}

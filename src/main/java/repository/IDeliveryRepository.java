/**
 * DeliveryRepository.java
 * This is a repository interface for Delivery entity
 * @author Nomta Mquqo 217296580
 * 08 April 2023
 */

package repository;

import domain.Delivery;

import java.util.Set;

public interface IDeliveryRepository extends IRepository<Delivery, String>{

    public Set<Delivery> getAll();


}

/*
 * IPaymentRepository.java
 * This is my repository class (interface) for payment
 * @author Mthandeni Mbobo - 218223579
 * April 2023
 */

package repository;

import domain.Payment;
import java.util.Set;

public interface IPaymentRepository extends IRepository<Payment, String>{

    public Set<Payment> getAll();
}

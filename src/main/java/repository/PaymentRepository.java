/*
 * PaymentRepository.java
 * This is my repository class for payment
 * @author Mthandeni Mbobo - 218223579
 * April 2023
 */

package repository;

import domain.Payment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class PaymentRepository implements IPaymentRepository{
    private List<Payment> payments;

    public PaymentRepository() {
        payments = new ArrayList<>();
    }

    @Override
    public Set<Payment> getAll() {
        return null;
    }

    //create
    @Override
    public Payment create(Payment payment) {
        payments.add(payment);
        return payment;
    }

    //read
    public List<Payment> getAllPayments() {
        return payments;
    }
    @Override
    public Payment read(String paymentId) {
        for (Payment payment : payments) {
            if (Objects.equals(payment.getPaymentId(), paymentId)) {
                return payment;
            }
        }
        return null;
    }

    //update
    @Override
    public Payment update(Payment payment) {
        for (int i = 0; i < payments.size(); i++) {
            if (Objects.equals(payments.get(i).getPaymentId(), payment.getPaymentId())) {
                payments.set(i, payment);
            }
        }
        return payment;
    }

    @Override
    public boolean delete(String paymentId) {
        for (int i = 0; i < payments.size(); i++) {
            if (Objects.equals(payments.get(i).getPaymentId(), paymentId)) {
                payments.remove(i);
                break;
            }
        }
        return false;
    }
}

/*
 * PaymentFactory.java
 * This is my factory class for payment
 * @author Mthandeni Mbobo - 218223579
 * April 2023
 */

package factory;

import domain.Payment;

public class PaymentFactory {
    /*public static Payment createPayment(double paymentAmount) {
        return createPayment(0, null, false);
    }*/
    public static Payment createPayment(int paymentId, int customerId, String paymentMethod, double paymentAmount, boolean paymentStatus)
    {
        Payment payment = new Payment.Builder().setPaymentId(String.valueOf(paymentId))
                .setPaymentMethod(paymentMethod)
                .setPaymentAmount(paymentAmount)
                .setPaymentStatus(paymentStatus)
                .build();

                return payment;
    }
}

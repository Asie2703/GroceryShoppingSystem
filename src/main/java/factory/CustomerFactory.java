/**
 * Customerfactory.java
 * This is a factory class for Customer
 * @author Sinentlahla Pindani 219081328
 * 08 April 2023
 */

package factory;

import domain.Customer;
import util.Helper;
public class CustomerFactory {
    public static Customer createCustomer(String firstName, String lastName, String phone, String email, String address) {
        if (Helper.isNullorEmpty(firstName) || Helper.isNullorEmpty(lastName) || Helper.isNullorEmpty(phone) || Helper.isNullorEmpty(address)) {
            return null;
        }
        String customerId = Helper.generateId();

        if (!Helper.isValidEmail(email)) {
            return null;
        }

        return new Customer.Builder()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setPhone(phone)
                .setEmail(email)
                .setAddress(address)
                .build();
    }


}

/**
 * UserFactory.java
 * This is a Factory class for User entity
 *
 * @author Anathi Mhlom 220006695
 * 06 April 2023
 */
package factory;

import domain.User;
import util.Helper;

public class UserFactory {
    public static User createUser(String userName, String userAddress, String userEmail, String userPhone) {
        if (!Helper.isNullorEmpty(userName)) {
            if (!Helper.isNullorEmpty(userEmail)) {
                Helper.isNullorEmpty(userPhone);
            }
            if (Helper.isValidEmail(userEmail)) {
                return null;
            }
            return null;
        }
        String userId = Helper.generateId();

        return new User.Builder()
                .setUserName(userName)
                .setUserAddress(userAddress)
                .setUserEmail(userEmail)
                .setUserPhone(userPhone)
                .build();
    }
}

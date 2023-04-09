/**
 * User.java
 * This is a POJO class for User entity
 *
 * @author Anathi Mhlom 220006695
 * 04 April 2023
 */

package domain;

public class User {
    private String userId;
    private String userName;
    private String userAddress;
    private String userEmail;
    private String userPhone;

    public User() {

    }

    private User(Builder builder) {
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.userAddress = builder.userAddress;
        this.userEmail = builder.userEmail;
        this.userPhone = builder.userPhone;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId: " + userId +
                "userName: " + userName + '\'' +
                "userAddress: " + userAddress + '\'' +
                "userEmail: " + userEmail + '\'' +
                "userPhone: " + userPhone + '\'' +
                "}";
    }

    public static class Builder {
        private String userId;
        private String userName;
        private String userAddress;
        private String userEmail;
        private String userPhone;

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserAddress(String userAddress) {
            this.userAddress = userAddress;
            return this;
        }

        public Builder setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public Builder setUserPhone(String userPhone) {
            this.userPhone = userPhone;
            return this;
        }

        public Builder builder(User user) {
            this.userId = user.userId;
            this.userName = user.userName;
            this.userAddress = user.userAddress;
            this.userEmail = user.userEmail;
            this.userPhone = user.userPhone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

/**
 * Admin.java
 * This is a POJO class for Admin entity
 *
 * @author Anathi Mhlom 220006695
 * 04 April 2023
 */

package domain;

public class Admin {
    private int adminId;
    private String adminName;
    private String adminPassword;
    private String adminEmail;
    private String adminPhone;

    public Admin() {

    }

    private Admin(Builder builder) {
        this.adminId = builder.adminId;
        this.adminName = builder.adminName;
        this.adminPassword = builder.adminPassword;
        this.adminEmail = builder.adminEmail;
        this.adminPhone = builder.adminPhone;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId: " + adminId +
                "adminName: " + adminName + '\'' +
                "adminPassword: " + adminPassword + '\'' +
                "adminEmail: " + adminEmail + '\'' +
                "adminPhone: " + adminPhone + '\'' +
                "}";
    }

    public static class Builder {
        private int adminId;
        private String adminName;
        private String adminPassword;
        private String adminEmail;
        private String adminPhone;

        public Builder setAdminName(String adminName) {
            this.adminName = adminName;
            return this;
        }

        public Builder setAdminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
            return this;
        }

        public Builder setAdminEmail(String adminEmail) {
            this.adminEmail = adminEmail;
            return this;
        }

        public Builder setAdminPhone(String adminPhone) {
            this.adminPhone = adminPhone;
            return this;
        }

        public Builder builder(Admin admin) {
            this.adminId = admin.adminId;
            this.adminName = admin.adminName;
            this.adminPassword = admin.adminPassword;
            this.adminEmail = admin.adminEmail;
            this.adminPhone = admin.adminPhone;
            return this;
        }

        public Admin build() {
            return new Admin(this);
        }
    }
}

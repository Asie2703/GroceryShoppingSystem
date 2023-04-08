/*
 * Payment.java
 * This is my worker class/POJO class
 * @author Mthandeni Mbobo - 218223579
 * April 2023
 */

package domain;

public class Payment {
    private String paymentId;
    private int customerId;
    private String paymentMethod;
    private double paymentAmount;
    private boolean paymentStatus;

    private Payment(){
        //
    }

    private Payment(Builder builder){
        this.paymentId = builder.paymentId;
        this.customerId = builder.customerId;
        this.paymentMethod = builder.paymentMethod;
        this.paymentAmount = builder.paymentAmount;
        this.paymentStatus = builder.paymentStatus;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId='" + paymentId + '\'' +
                ", customerId=" + customerId +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentAmount=" + paymentAmount +
                ", paymentStatus=" + paymentStatus +
                '}';
    }
    public static class Builder{
        private String paymentId;
        private int customerId;
        private String paymentMethod;
        private double paymentAmount;
        private boolean paymentStatus;

        public Builder setPaymentId(String paymentId) {
            this.paymentId = paymentId;
            return this;
        }

        public Builder setCustomerId(int customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder setPaymentAmount(double paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }

        public Builder setPaymentStatus(boolean paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }

        public Builder copy(Payment payment){
            this.paymentId = payment.paymentId;
            this.customerId = payment.customerId;
            this.paymentMethod = payment.paymentMethod;
            this.paymentAmount = payment.paymentAmount;
            this.paymentStatus = payment.paymentStatus;
            return this;
        }

        public Payment build(){
            return new Payment(this);
        }
    }
}

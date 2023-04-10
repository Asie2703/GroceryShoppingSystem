
/**
 * Order.java
 * This is a POJO class for order entity
 * @author Nomta Mquqo 217296580
 * 04 April 2023
 */
package domain;

public class Order {
    private String id;
    private String orderNumber;
    private String type;
    private String description;

    private Customer customer;

    public Order(Builder builder) {
        this.id = builder.id;
        this.orderNumber = builder.orderNumber;
        this.type = builder.type;
        this.description = builder.description;
        this.customer = builder.customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public static class Builder {
        private String id;
        private String orderNumber;
        private String type;
        private String description;

        private Customer customer;

        public Builder orderId(String id) {
            this.id = id;
            return this;
        }
        public Builder orderNumber(String orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }

        public Builder typeOfOrder(String type) {
            this.type = type;
            return this;
        }

        public Builder descriptionOfOrder(String description) {
            this.description = description;
            return this;
        }

        public Builder customer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public Builder copy(String orderNumber, String type, String description, Customer customer) {
            this.orderNumber = orderNumber;
            this.type = type;
            this.description = description;
            this.customer = customer;
            return this;
        }

        public Order build(){
            return new Order(this);
        }
    }
}

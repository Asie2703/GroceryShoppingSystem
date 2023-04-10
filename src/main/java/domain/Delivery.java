/**
 * Delivery.java
 * This is a POJO class for delivery entity
 * @author Nomta Mquqo 217296580
 * 04 April 2023
 */

package domain;

import java.util.Date;

public class Delivery {
    private String id;
    private String address;
    private Date deliveryDate;
    private String deliveredBy;
    private String description;
    private String type;
    private Customer customer;

    public Delivery(Builder builder) {
        this.id = builder.id;
        this.address = builder.address;
        this.deliveryDate = builder.deliveryDate;
        this.deliveredBy = builder.deliveredBy;
        this.description = builder.description;
        this.type = builder.type;
        this.customer = builder.customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveredBy() {
        return deliveredBy;
    }

    public void setDeliveredBy(String deliveredBy) {
        this.deliveredBy = deliveredBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public static class Builder {
        private String id;
        private String address;
        private Date deliveryDate;
        private String deliveredBy;
        private String description;
        private String type;
        private Customer customer;

        public Builder deliveryId(String id) {
            this.id = id;
            return this;
        }
        public Builder deliveryAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder dateOfDelivery(Date deliveryDate) {
            this.deliveryDate = deliveryDate;
            return this;
        }

        public Builder deliveredBy(String deliveredBy) {
            this.deliveredBy = deliveredBy;
            return this;
        }

        public Builder typeOfDelivery(String type) {
            this.type = type;
            return this;
        }

        public Builder descriptionOfDelivery(String description) {
            this.description = description;
            return this;
        }

        public Builder customer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public Builder copy(String id, String address, Date deliveryDate, String deliveredBy, String description, String type, Customer customer) {
            this.id = id;
            this.address = address;
            this.deliveryDate = deliveryDate;
            this.deliveredBy = deliveredBy;
            this.description = description;
            this.type = type;
            this.customer = customer;
            return this;
        }

        public Delivery build(){
            return new Delivery(this);
        }
    }
}

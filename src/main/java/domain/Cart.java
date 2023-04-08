/*
 * Cart.java
 * This is my worker class/POJO class
 * @author Mthandeni Mbobo - 218223579
 * April 2023
 */

package domain;

import java.awt.image.BufferedImage;
public class Cart {
    private int customerId;
    private BufferedImage productImage;
    private String productName;
    private String productDescription;
    private double productPrice;
    private int productQuantity;
    private double totalPrice;

    private Cart(){
        //
    }

    private Cart(Builder builder){
        this.customerId = builder.customerId;
        this.productImage = builder.productImage;
        this.productName = builder.productName;
        this.productDescription = builder.productDescription;
        this.productPrice = builder.productPrice;
        this.productQuantity = builder.productQuantity;
        this.totalPrice = builder.totalPrice;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public BufferedImage getProductImage() {
        return productImage;
    }

    public void setProductImage(BufferedImage productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "customerId=" + customerId +
                ", productImage=" + productImage +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productPrice=" + productPrice +
                ", productQuantity=" + productQuantity +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public static class Builder{
        private int customerId;
        private BufferedImage productImage;
        private String productName;
        private String productDescription;
        private double productPrice;
        private int productQuantity;
        private double totalPrice;

        public Builder setCustomerId(int customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setProductImage(BufferedImage productImage) {
            this.productImage = productImage;
            return this;
        }

        public Builder setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder setProductDescription(String productDescription) {
            this.productDescription = productDescription;
            return this;
        }

        public Builder setProductPrice(double productPrice) {
            this.productPrice = productPrice;
            return this;
        }

        public Builder setProductQuantity(int productQuantity) {
            this.productQuantity = productQuantity;
            return this;
        }

        public Builder setTotalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public Builder copy(Cart cart){
            this.customerId = cart.customerId;
            this.productImage = cart.productImage;
            this.productName = cart.productName;
            this.productDescription = cart.productDescription;
            this.productPrice = cart.productPrice;
            this.productQuantity = cart.productQuantity;
            this.totalPrice = cart.totalPrice;
            return this;
        }

        public Cart build(){
            return new Cart(this);
        }
    }
}

/*
 * Cart.java
 * This is my worker class/POJO class
 * @author Mthandeni Mbobo - 218223579
 * April 2023
 */

package domain;

public class Cart {
    private String cartId;
    private int productQuantity;
    private double totalPrice;

    //foreign keys
    /*productName - Product.java
    productImage - Product.java
    productDescription - Product.java
    productPrice - Product.java
    */

    public Cart(){
        //
    }

    private Cart(Builder builder){
        this.cartId = String.valueOf(builder.cartId);
        this.productQuantity = builder.productQuantity;
        this.totalPrice = builder.totalPrice;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = String.valueOf(cartId);
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
                "cartId=" + cartId +
                ", productQuantity=" + productQuantity +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public static class Builder{
        private String cartId;
        private int productQuantity;
        private double totalPrice;

        public Builder setCartId(int cartId) {
            this.cartId = String.valueOf(cartId);
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
            this.cartId = cart.cartId;
            this.productQuantity = cart.productQuantity;
            this.totalPrice = cart.totalPrice;
            return this;
        }

        public Cart build(){
            return new Cart(this);
        }
    }
}

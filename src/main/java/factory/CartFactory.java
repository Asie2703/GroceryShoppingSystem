/*
 * CartFactory.java
 * This is my factory class for cart
 * @author Mthandeni Mbobo - 218223579
 * April 2023
 */

package factory;

import domain.Cart;

import java.awt.image.BufferedImage;

public class CartFactory {
    public static Cart createCart(int cartId, double productPrice, int productQuantity, double totalPrice)
    {

        Cart cart = new Cart.Builder().setCartId(Integer.parseInt(String.valueOf(cartId)))
                .setTotalPrice(productPrice)
                .setProductQuantity(productQuantity)
                .setTotalPrice(totalPrice)
                .build();
        return cart;

    }
}

/*
 * CartRepository.java
 * This is my repository class for cart
 * @author Mthandeni Mbobo - 218223579
 * April 2023
 */

package repository;

import domain.Cart;
import domain.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CartRepository implements ICartRepository {

    private Map<String, Integer> cartItems;

    public CartRepository() {
        cartItems = new HashMap<>();
    }

    @Override
    public Set<Cart> getAll() {
        return null;
    }

    @Override
    public Cart create(Cart cart) {
        int quantity = Integer.parseInt(null);
        if (cartItems.containsKey(cart)) {
            int currentQuantity = cartItems.get(cart);
            cartItems.put(String.valueOf(cart), currentQuantity + quantity);
        } else {
            cartItems.put(String.valueOf(cart), quantity);
        }
        return cart;
    }

    @Override
    public Cart read(String cartId) {
        return (Cart) cartItems;
    }

    @Override
    public Cart update(Cart cart) {
        int newQuantity = Integer.parseInt(null);
        if (cartItems.containsKey(cart)) {
            cartItems.put(String.valueOf(cart), newQuantity);
        }
        return cart;
    }

    @Override
    public boolean delete(String cartId) {
        if (cartItems.containsKey(cartId)) {
            cartItems.remove(cartId);
        }
        return false;
    }
}

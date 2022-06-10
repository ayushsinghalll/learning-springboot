package org.example;

public class Shopping {
    private Cart cart;

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "Shopping{" +
                "cart=" + cart +
                '}';
    }
}

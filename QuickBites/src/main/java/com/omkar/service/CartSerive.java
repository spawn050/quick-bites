package com.omkar.service;

import com.omkar.Exception.CartException;
import com.omkar.Exception.CartItemException;
import com.omkar.Exception.FoodException;
import com.omkar.Exception.UserException;
import com.omkar.model.Cart;
import com.omkar.model.CartItem;
import com.omkar.model.Food;
import com.omkar.model.User;
import com.omkar.request.AddCartItemRequest;
import com.omkar.request.UpdateCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}

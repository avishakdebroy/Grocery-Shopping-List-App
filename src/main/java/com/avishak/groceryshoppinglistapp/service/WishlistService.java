package com.avishak.groceryshoppinglistapp.service;

import com.avishak.groceryshoppinglistapp.entity.Wishlist;

import java.util.List;

public interface WishlistService {
    List<Wishlist> findAllWishlists();
    void saveWishlist(Wishlist wishlist);
    Wishlist findWishlistById(Long id);
    void deleteWishlistById(Long id);
}

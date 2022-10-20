package com.avishak.groceryshoppinglistapp.service.Impl;

import com.avishak.groceryshoppinglistapp.entity.Wishlist;
import com.avishak.groceryshoppinglistapp.repository.WishlistRepository;
import com.avishak.groceryshoppinglistapp.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**@author Avishak
 * This class implements the WishlistService interface.
 * It handles the business logic for the Wishlist entity.
 */
@Service
public class WishlistServiceImpl implements WishlistService {
    @Autowired
    private WishlistRepository wishlistRepository;

    public WishlistServiceImpl(WishlistRepository wishlistRepository) {
        this.wishlistRepository = wishlistRepository;
    }

    @Override
    public void saveWishlist(Wishlist wishlist) {
        this.wishlistRepository.save(wishlist);
    }

    @Override
    public Wishlist findWishlistById(Long id) {
        Optional<Wishlist> optional = wishlistRepository.findById(id);
        Wishlist wishlist = null;
        if (optional.isPresent()) {
            wishlist = optional.get();
        } else {
            throw new RuntimeException(" Wishlist not found for id :: " + id);
        }
        return wishlist;
    }

    @Override
    public void deleteWishlistById(Long id) {
        this.wishlistRepository.deleteById(id);
    }
    @Override
    public List<Wishlist> findAllWishlists() {
        return wishlistRepository.findAll();
    }
}

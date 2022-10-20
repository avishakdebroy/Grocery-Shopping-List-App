package com.avishak.groceryshoppinglistapp.repository;

import com.avishak.groceryshoppinglistapp.entity.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**@author Avishak
 * This interface is the repository for the Wishlist entity.
 * It handles the database operations for the Wishlist entity.
 */
@Repository
public interface WishlistRepository extends JpaRepository<Wishlist, Long> {
}


package com.avishak.groceryshoppinglistapp.repository;

import com.avishak.groceryshoppinglistapp.entity.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishlistRepository extends JpaRepository<Wishlist, Long> {
}


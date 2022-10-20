package com.avishak.groceryshoppinglistapp.service.Impl;


import com.avishak.groceryshoppinglistapp.entity.Wishlist;
import com.avishak.groceryshoppinglistapp.repository.WishlistRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class WishlistServiceImplTest {

            @Mock
            private WishlistRepository wishlistRepository;

            private WishlistServiceImpl underTest;

            @BeforeEach
            void setUp() {
                underTest = new WishlistServiceImpl(wishlistRepository);
            }

            @Test
            void itShouldSaveWishlist() {
                // given
                Wishlist wishlist = new Wishlist();

                // when
                underTest.saveWishlist(wishlist);

                // then
                verify(wishlistRepository).save(wishlist);
            }

}
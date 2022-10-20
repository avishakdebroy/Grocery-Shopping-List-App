package com.avishak.groceryshoppinglistapp.controller;

import com.avishak.groceryshoppinglistapp.entity.Wishlist;
import com.avishak.groceryshoppinglistapp.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
/**@author Avishak
 * This class is the controller for the Wishlist entity.
 * It handles the requests and responses for the Wishlist entity.
 */
@Controller
public class WishlistController {

    @Autowired
    private WishlistService wishlistService;

    @GetMapping("/wishlists")
    public String viewWishlistPage(Model model) {
        model.addAttribute("listWishlists", wishlistService.findAllWishlists());
        return "wishlists";
    }

    @GetMapping("/add-wishlist")
    public String addWishlistForm(Model model) {
        Wishlist wishlist = new Wishlist();
        model.addAttribute("wishlist", wishlist);
        return "add_wishlist";
    }

    @GetMapping("/update-wishlist/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
        Wishlist wishlist = wishlistService.findWishlistById(id);
        model.addAttribute("wishlist", wishlist);
        return "update_wishlist";
    }

    @GetMapping("/delete-wishlist/{id}")
    public String deleteWishlist(@PathVariable(value = "id") long id) {
        this.wishlistService.deleteWishlistById(id);
        return "redirect:/wishlists";
    }

    @PostMapping("/save-wishlist")
    public String saveWishlist(@ModelAttribute("wishlist") Wishlist wishlist) {
        wishlistService.saveWishlist(wishlist);
        return "redirect:/wishlists";
    }

}

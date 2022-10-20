package com.avishak.groceryshoppinglistapp.controller;

import com.avishak.groceryshoppinglistapp.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WishlistController {

    @Autowired
    private WishlistService wishlistService;

    @GetMapping("/wishlists")
    public String viewWishlistPage(Model model) {
        model.addAttribute("listWishlists", wishlistService.findAllWishlists());
        return "wishlists";
    }

}

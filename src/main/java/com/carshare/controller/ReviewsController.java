package com.carshare.controller;

import com.carshare.Models.Review;
import com.carshare.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewsController {

    private ReviewRepository rr;
    @Autowired
    public ReviewsController(ReviewRepository rr){
        this.rr = rr;
    }
    @RequestMapping(value = {"/rules"})
    public String rules(Model model){
        model.addAttribute("reviews", rr.findAll());
        model.addAttribute("review", new Review());
        return "reviews";
    }
    @PostMapping
    public String newReview(Review review){
        rr.save(review);
        return "redirect:/";
    }

}
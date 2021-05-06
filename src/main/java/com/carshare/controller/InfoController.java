package com.carshare.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/information")
@RequiredArgsConstructor
public class InfoController {

    @GetMapping
    public String info() {
        return "index";
    }
}

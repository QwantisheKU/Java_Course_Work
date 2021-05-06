package com.carshare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactsController {

    @RequestMapping(value = {"/contacts"})
    public String contacts(){
        return "contacts";
    }

}

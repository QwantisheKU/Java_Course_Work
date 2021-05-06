package com.carshare.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.carshare.dto.RegisterDTO;
import com.carshare.exceptions.UserAlreadyExistsException;
import com.carshare.service.UserService;

import javax.validation.Valid;
import java.util.Map;

@Controller
@RequestMapping("/register")
@RequiredArgsConstructor
public class RegisterController {
    private final UserService userService;

    @GetMapping
    public String register() {
        return "register";
    }

    @PostMapping
    public String addUser(
            @Valid @ModelAttribute("signUpUser") RegisterDTO registerDTO,
            BindingResult result,
            Map<String, Object> model
    ) {
        if (!result.hasErrors()) {
            if (!registerDTO.getPassword().equals(registerDTO.getMatchingPassword())) {
                model.put("notMatched", true);
                return "register";
            }
            try {
                userService.addNewUser(registerDTO);
                return "redirect:/login";
            } catch (UserAlreadyExistsException exp) {
                model.put("alreadyExists", true);
                return "register";
            }
        }
        return "register";
    }
}

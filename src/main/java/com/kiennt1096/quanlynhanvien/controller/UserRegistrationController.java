package com.kiennt1096.quanlynhanvien.controller;

import com.kiennt1096.quanlynhanvien.dto.UserRegistratrionDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.kiennt1096.quanlynhanvien.service.UserService;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
    private UserService userService;

    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserRegistratrionDto userRegistratrionDto() {
        return new UserRegistratrionDto();
    }

    @GetMapping
    public String showRegistrationForm() {
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistratrionDto userRegistratrionDto) {
        userService.save(userRegistratrionDto);
        return "redirect:/registration?success";
    }
}

package com.pamungkasaji.donasi.controller;

import com.pamungkasaji.donasi.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/user")
@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }

    @RequestMapping({"","/", "/index", "/index.html"})
    public String userList(Model model){

        model.addAttribute("users", userService.findAllUser());

        return "user/index";
    }

    @GetMapping("/{userId}")
    public ModelAndView showUser(@PathVariable Long userId) throws Exception{
        ModelAndView mav = new ModelAndView("user/userDetail");
        mav.addObject(userService.findUserById(userId));
        return mav;
    }
}

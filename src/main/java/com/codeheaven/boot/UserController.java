package com.codeheaven.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    private UserRepository userRepository;

    @GetMapping(path = "/add")
    public @ResponseBody
    String addUser(@RequestParam String name
            , @RequestParam String dept) {

        User user = new User();
        user.setName(name);
        user.setDept(dept);
        userRepository.save(user);
        return "User saved successfully";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {

        return userRepository.findAll();
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}

package com.springbooti.action;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by terry on 2017/6/17.
 */
@RestController
public class UserController {

    @RequestMapping("/users/{username}_{desp}")
    public String userProfile(@PathVariable("username") String username,@PathVariable("desp") String desp) {
        return String.format("user %s is %s", username,desp);
    }

    @RequestMapping("/posts/{id}")
    public String post(@PathVariable("id") int id) {
        return String.format("post %d", id);
    }
}

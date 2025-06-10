package com.SpringBootJpaL2CacheTransactional.controller;

import com.SpringBootJpaL2CacheTransactional.entity.UserDetails;
import com.SpringBootJpaL2CacheTransactional.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api")
public class UserController {
    @Autowired
    UserDetailService userDetailService;

    @PostMapping(path="/user")
    public UserDetails insertUser(@RequestBody UserDetails userDetails){
        return userDetailService.saveUser(userDetails);
    }

    @PutMapping(path="/user/{id}")
    public UserDetails updateUser(@PathVariable Long id,@RequestBody UserDetails userDetails){
        return userDetailService.updateUser(id,userDetails);
    }

    @GetMapping("/user/{id}")
    public UserDetails getUser2(){
        return userDetailService.findById(1l);
    }
}

package com.rqb.controller;

import com.rqb.dao.UserRepository;
import com.rqb.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

//    @Autowired
//    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        //User user = this.userRepository.getOne(id);
        User user = new User();
        user.setId(1l);
        user.setAge(23);
        user.setName("renqingbin");
        user.setUsername("fsfasfaf");
        return user;
    }

}

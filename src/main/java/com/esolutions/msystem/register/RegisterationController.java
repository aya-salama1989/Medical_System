package com.esolutions.msystem.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterationController {

    @Autowired
    private RegisterationService registerationService;

    @RequestMapping(method = RequestMethod.POST,value = "/register")
    public boolean register(@RequestBody User user) {
        if(registerationService.getUser(user.getUserId())!=null){
            return true; //if authorized
        }
        return false;//not valid; create a user then?

    }
}

package com.example.test.Controller;


import com.example.test.Entity.PolicyUser;
import com.example.test.Exception.InsurancePolicyRejectedException;
import com.example.test.Repository.PolicyUserRepository;
import com.example.test.Service.PolicyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policyuser")
public class PolicyUserController {

    @Autowired
    PolicyUserService policyUserService;
    @PostMapping("/users")
    public ResponseEntity<?> registerUser(@RequestBody PolicyUser user) {
        try {
            PolicyUser savedUser = policyUserService.registerUser(user);
            return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
        } catch (InsurancePolicyRejectedException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}

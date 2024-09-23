package com.example.test.Controller;


import com.example.test.Entity.InsurancePolicy;
import com.example.test.Entity.PolicyUser;
import com.example.test.Exception.InsurancePolicyRejectedException;
import com.example.test.Service.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/insurance")
public class InsuranceController {

    @Autowired
    InsuranceService insuranceService;

    @PostMapping("/policies")
    public ResponseEntity<?> createPolicy(@RequestBody InsurancePolicy policy) {
        InsurancePolicy savedPolicy = insuranceService.createPolicy(policy);
        return new ResponseEntity<>(savedPolicy, HttpStatus.CREATED);
    }
}

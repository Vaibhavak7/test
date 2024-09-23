package com.example.test.Service;

import com.example.test.Entity.PolicyUser;
import com.example.test.Exception.InsurancePolicyRejectedException;
import com.example.test.Repository.PolicyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyUserService {

    @Autowired
    private PolicyUserRepository userRepository;


    public PolicyUser registerUser(PolicyUser user) {
        String[] problematicConditions = {"Heart", "Kidney", "Liver", "Brain", "Eyes"};

        for (String condition : problematicConditions) {
            if (user.getMedicalConditions().toLowerCase().contains(condition.toLowerCase())) {
                throw new InsurancePolicyRejectedException("The user has a medical condition related to: " + condition);
            }
        }

        return userRepository.save(user);
    }
}

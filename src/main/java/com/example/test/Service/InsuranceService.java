package com.example.test.Service;

import com.example.test.Entity.InsurancePolicy;
import com.example.test.Repository.InsurancePolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InsuranceService {

    @Autowired
    private InsurancePolicyRepository insurancePolicyRepository;

    public InsurancePolicy createPolicy(InsurancePolicy policy) {
        return insurancePolicyRepository.save(policy);
    }
}

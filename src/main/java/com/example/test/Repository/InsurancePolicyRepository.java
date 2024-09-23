package com.example.test.Repository;

import com.example.test.Entity.InsurancePolicy;
import org.springframework.data.repository.CrudRepository;

public interface InsurancePolicyRepository extends CrudRepository<InsurancePolicy,Integer> {
}

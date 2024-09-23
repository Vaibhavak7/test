package com.example.test.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class InsurancePolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String policyName;
    private String policyInsurer;
    private double premium;

    public InsurancePolicy() {
    }

    public InsurancePolicy(Long id, String policyName, String policyInsurer, double premium) {
        this.id = id;
        this.policyName = policyName;
        this.policyInsurer = policyInsurer;
        this.premium = premium;
    }

    @Override
    public String toString() {
        return "InsurancePolicy{" +
                "id=" + id +
                ", policyNdame='" + policyName + '\'' +
                ", policyInsurer='" + policyInsurer + '\'' +
                ", premium=" + premium +
                '}';
    }
}
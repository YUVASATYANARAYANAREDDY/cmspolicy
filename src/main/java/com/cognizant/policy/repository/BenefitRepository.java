package com.cognizant.policy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.policy.entity.Benefit;

public interface BenefitRepository extends JpaRepository<Benefit, String>{

}

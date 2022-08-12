package com.cognizant.policy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.policy.entity.ClientPolicy;
@Repository
public interface PolicyRepository extends JpaRepository<ClientPolicy, String>{
	
}

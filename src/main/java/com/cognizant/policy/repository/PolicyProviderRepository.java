package com.cognizant.policy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cognizant.policy.entity.PolicyProvider;

public interface PolicyProviderRepository extends JpaRepository<PolicyProvider, String>{
	@Query (value="select p from PolicyProvider p where p.policy_id=:pid")
    public List<PolicyProvider> getChainOfProviders(@Param("pid") String pid);
	

}

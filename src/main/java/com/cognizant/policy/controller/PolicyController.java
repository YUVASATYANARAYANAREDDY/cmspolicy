package com.cognizant.policy.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.policy.entity.PolicyProvider;
import com.cognizant.policy.exception.PolicyNotFoundException;
import com.cognizant.policy.exception.TokenExpireException;
import com.cognizant.policy.service.PolicyService;



@RestController
public class PolicyController {
	@Autowired
	PolicyService service;
	
	Logger logger = LoggerFactory.getLogger(PolicyController.class);
	@GetMapping(value="/getEligibleClaimAmount/{benefitId}")
	public Integer getEligibleClaimAmount(@PathVariable("benefitId") String benefitId, 
		@RequestHeader("Authorization") String token)throws PolicyNotFoundException {
		return service.getEligibleClaimAmount(benefitId);
	}
	
	@GetMapping(value="/getEligibleBenefits/{policyId}")
	public String getEligibleBenefits(@PathVariable("policyId") String policyId,
			@RequestHeader("Authorization") String token) throws PolicyNotFoundException, TokenExpireException{
		return service.getEligibleBenefits(policyId,token);
	}
	@GetMapping(value="/getChainOfProviders/{policyId}")
	public List<PolicyProvider> getChainOfProviders(@PathVariable("policyId") String policyId){
		return service.getChainOfProviders(policyId);
	}
}

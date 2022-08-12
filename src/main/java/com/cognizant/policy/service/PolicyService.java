package com.cognizant.policy.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognizant.policy.client.AuthClient;
import com.cognizant.policy.entity.Benefit;
import com.cognizant.policy.entity.ClientPolicy;
import com.cognizant.policy.entity.PolicyProvider;
import com.cognizant.policy.exception.PolicyNotFoundException;
import com.cognizant.policy.exception.TokenExpireException;
import com.cognizant.policy.repository.BenefitRepository;
import com.cognizant.policy.repository.PolicyProviderRepository;
import com.cognizant.policy.repository.PolicyRepository;





@Service
public class PolicyService {
	@Autowired
	PolicyRepository policyrepo;
	@Autowired
	PolicyProviderRepository policyProviderRepository;
	@Autowired
	AuthClient authClient;
	@Autowired
	BenefitRepository benerepo;
	public Integer getEligibleClaimAmount(String Benefitid) throws PolicyNotFoundException {
		//ClientPolicy policy = policyrepo.findById(policyId).orElse(null);
		Benefit benefit=benerepo.findById(Benefitid).orElse(null);
		if(benefit==null)
			throw new PolicyNotFoundException("Policy not found");
		else
			return benefit.getEligible_claim_amount();
	}
	public String getEligibleBenefits(String policyId, String token) throws PolicyNotFoundException, TokenExpireException {
		if(authClient.authorizeTheRequest(token)) {
		ClientPolicy policy = policyrepo.findById(policyId).orElse(null);
		if(policy==null)
			throw new PolicyNotFoundException("Policy not found");
		else
			return policy.getPolicyBenefits();
			
		}
		else
		{
			throw new TokenExpireException("Token is expired");
		}
	}
	//PolicyProviderRepository policyProviderRepository;
	public List<PolicyProvider> getChainOfProviders(String policyId){
		List<PolicyProvider> list= policyProviderRepository.getChainOfProviders(policyId);
		return list;
		
	}

}

package com.cognizant.policy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.cognizant.policy.service.CustomIdGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name="Benefit")
public class Benefit {
	@Id
	@NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Benefit_seq")
    @GenericGenerator(
        name = "Benefit_seq", 
        strategy = "com.cognizant.policy.service.CustomIdGenerator", 
        parameters = {
            @Parameter(name = CustomIdGenerator.INCREMENT_PARAM, value = "1"),
            @Parameter(name = CustomIdGenerator.VALUE_PREFIX_PARAMETER, value = "CMS_B"),
            @Parameter(name = CustomIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%03d") })
	private String id;
	private String name;
	private Integer eligible_claim_amount;
	private String memberId;
	private String policyId;
	public Integer getEligible_claim_amount() {
		return eligible_claim_amount;
	}


	
}

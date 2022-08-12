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
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name="Policy")
public class ClientPolicy {
	
	@Id
	@NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "policy_seq")
    @GenericGenerator(
        name = "policy_seq", 
        strategy = "com.cognizant.policy.service.CustomIdGenerator", 
        parameters = {
            @Parameter(name = CustomIdGenerator.INCREMENT_PARAM, value = "1"),
            @Parameter(name = CustomIdGenerator.VALUE_PREFIX_PARAMETER, value = "CMS_M"),
            @Parameter(name = CustomIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%03d") })
	private String Id;
	private String name;
	private String benefits;
	private Integer tenure;
	private Integer premium;
	private Integer latecharges;
	private String hospital_id;
	public String getPolicyBenefits() {
		return benefits;
	}
	public Integer getTenure() {
		return tenure;
	}
}

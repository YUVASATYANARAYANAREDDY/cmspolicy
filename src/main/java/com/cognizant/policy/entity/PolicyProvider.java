package com.cognizant.policy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="POLICYPROVIDER")
@Setter
@Getter
@ToString
public class PolicyProvider {
	
	@Id
	@NotNull
	 private String id;
	 private String hospital_name;
	 private String location;
	 private String phno;
	 private String is_health_care_provider;
	 private String policy_id;
	 

}

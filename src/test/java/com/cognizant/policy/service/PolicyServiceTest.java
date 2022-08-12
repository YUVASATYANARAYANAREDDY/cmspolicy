package com.cognizant.policy.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cognizant.policy.client.AuthClient;
import com.cognizant.policy.entity.ClientPolicy;
import com.cognizant.policy.entity.PolicyProvider;
import com.cognizant.policy.exception.PolicyNotFoundException;
import com.cognizant.policy.exception.TokenExpireException;
import com.cognizant.policy.repository.PolicyProviderRepository;
import com.cognizant.policy.repository.PolicyRepository;
import com.cognizant.policy.service.PolicyService;

class PolicyServiceTest {
	

}

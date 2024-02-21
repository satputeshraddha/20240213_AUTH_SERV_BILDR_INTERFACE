package org.dnyanyog.service;

import java.util.List;

import org.dnyanyog.dto.AuthorizationRequest;
import org.dnyanyog.dto.AuthorizationResponse;
import org.springframework.stereotype.Service;
@Service
public interface AuthorizationService 
{
	public AuthorizationResponse authorize(AuthorizationRequest request);

	public List<AuthorizationResponse> getAllAuthors();

}

package com.vel.swaggerDemo.service.impl;

import org.springframework.stereotype.Component;

import com.vel.swaggerDemo.request.BasicMembersRequest;
import com.vel.swaggerDemo.request.RegisterUserRequest;
import com.vel.swaggerDemo.response.BasicMembersResponse;
import com.vel.swaggerDemo.response.RegisterUserResponse;
import com.vel.swaggerDemo.service.MatrimonyService;

@Component("matrimonyServiceImpl")
public class MatrimonyServiceImpl implements MatrimonyService {

	@Override
	public RegisterUserResponse createUser(RegisterUserRequest registerUserRequest) {
		return new RegisterUserResponse();
	}

	@Override
	public BasicMembersResponse updateBasicDetails(BasicMembersRequest basicMembersRequest) {
		return new BasicMembersResponse();
	}

}

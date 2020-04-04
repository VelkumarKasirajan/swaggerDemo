package com.vel.swaggerDemo.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vel.swaggerDemo.request.BasicMembersRequest;
import com.vel.swaggerDemo.request.RegisterUserRequest;
import com.vel.swaggerDemo.response.BasicMembersResponse;
import com.vel.swaggerDemo.response.RegisterUserResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Path("/")
@Api(value = "Matrimony Service", consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface MatrimonyService {

	@POST
	@Path("/createuser")
	@ApiOperation(value = "Create user")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success", response = RegisterUserResponse.class),
			@ApiResponse(code = 404, message = "Not Found")
	})
	RegisterUserResponse createUser(RegisterUserRequest registerUserRequest);
	
	@POST
	@Path("/updateBasicDetails")
	@ApiOperation(value = "Update Basic Details")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success", response = BasicMembersResponse.class),
			@ApiResponse(code = 404, message = "Not Found")
	})
	BasicMembersResponse updateBasicDetails(BasicMembersRequest basicMembersRequest);
	
}

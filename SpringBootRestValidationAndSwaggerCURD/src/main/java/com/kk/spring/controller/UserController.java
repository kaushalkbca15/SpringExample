package com.kk.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kk.spring.dto.UserDTO;
import com.kk.spring.entity.UserEntity;
import com.kk.spring.repositry.UserRespositry;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.spring.web.json.Json;

@RestController
@RequestMapping("/user/")
@Api(value="Employee registation",description="Operation for saving employee details")
public class UserController {

	@Autowired
	private UserRespositry userRespositry;

	 @ApiOperation(value = "save employee details",response = Json.class)
	   @ApiResponses(value = {
	            @ApiResponse(code = 200, message = "Successfully retrieved list"),
	            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	    }
	    )
	@RequestMapping(value="save",method=RequestMethod.POST)
	public String saveUser(@Valid @RequestBody UserDTO userDTO) {
		UserEntity entity = new UserEntity();
		entity.setName(userDTO.getName());
		entity.setAddes(userDTO.getAddes());
		return userRespositry.save(entity).getId().toString();
	}
	
	
	@RequestMapping(value="get/{id}",method=RequestMethod.GET)
	public UserEntity getUserById(@PathVariable Long id) {
		return userRespositry.getOne(id);
	}
	
	@RequestMapping(value="update",method=RequestMethod.POST)
	public String updateUser(@RequestBody UserDTO userDTO) {
		UserEntity entity = new UserEntity();
		entity.setName(userDTO.getName());
		entity.setAddes(userDTO.getAddes());
		entity.setId(userDTO.getId());
		return userRespositry.save(entity).getId().toString();
	}
	
	@RequestMapping(value="delete/{id}",method=RequestMethod.GET)
	public String deleteUserById(@PathVariable Long id) {
		UserEntity entity = new UserEntity();entity.setId(id);
		userRespositry.delete(entity);
		return "success";
	}
	
}

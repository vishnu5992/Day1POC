package com.example.POC1.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.POC1.model.UserModel;

@RestController
public class UserController {

	 
	  
	  @PostMapping("/adduser")
	  public UserModel adduser(@RequestBody UserModel user) {
		return user;
		  
	  }
	  
	  @PutMapping("/edituser")
	  public UserModel edituser(@RequestBody UserModel user) {
		return user;
		 
	  }
	  
	  @DeleteMapping("/deleteuser")
	   public String  deleteAllUser() {
		     
		  String result = "";
		  try {
			  result = "all recordss deleted sucessfully";
		  }
		  catch(Exception e) {
			  result = "error occured";
		  }
		  return result;
	  }
	  
	@GetMapping("/getalluser")
	   public  UserModel getallUser(@RequestBody UserModel user){
		
		return user;
		
	}
	  }
	  


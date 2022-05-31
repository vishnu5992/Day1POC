package com.example.POC2.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.POC2.model.UserModel;

@RestController
public class RestApi {
            
//	public static final String POST_ALL_USER_API = "http://localhost:8080/adduser";
//	public static final String EDIT_ALL_USER_API = "http://localhost:8080/edituser";
//	public static final String DELETE_ALL_USER_API = "http://localhost:8080/deleteuser";
//	public static final String GET_ALL_USER_API = "http://localhost:8080/getalluser";
//	
	
	 @Autowired
	   RestTemplate restTemplate;
	 
	   @RequestMapping(value = "/template/adduser")
	   public  String addUser(@RequestBody UserModel um) {
		 HttpHeaders headers = new HttpHeaders();
		 headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		 HttpEntity<UserModel> entity = new HttpEntity<UserModel>(um,headers);
		 ResponseEntity<String> entity1 = restTemplate.exchange("http://localhost:8080/adduser", HttpMethod.POST, entity,String.class);
		 System.out.println(entity1);
		 return entity1.getBody();

    }
	   
	   @RequestMapping(value="/template/edituser")
       public String edituser(@RequestBody UserModel um) {
		      HttpHeaders headers = new HttpHeaders();
		      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		      HttpEntity <UserModel> entity = new HttpEntity<UserModel>(um,headers);
		 ResponseEntity<String> entity1 = restTemplate.exchange("http://localhost:8080/edituser", HttpMethod.PUT, entity,String.class);
		 System.out.println(entity1);
          return entity1.getBody();
               
	   }
	   
	   @RequestMapping(value="/template/deleteuser")
       public String deleteuser(@RequestBody UserModel um) {
		      HttpHeaders headers = new HttpHeaders();
		      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		      HttpEntity <UserModel> entity = new HttpEntity<UserModel>(um,headers);
		 ResponseEntity<String> entity1 = restTemplate.exchange("http://localhost:8080/deleteuser", HttpMethod.DELETE, entity,String.class);
		 System.out.println(entity1);
          return entity1.getBody();
               
	   }
	   
	   @RequestMapping(value="/template/getalluser")
	    public String getalluser(@RequestBody UserModel um) {
		      HttpHeaders headers = new HttpHeaders();
		      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		      HttpEntity <UserModel> entity = new HttpEntity<UserModel>(um,headers);
			ResponseEntity<String> entity1 = restTemplate.exchange("http://localhost:8080/getalluser", HttpMethod.GET, entity,String.class);
            return entity1.getBody();
	   }
	   
	   
}

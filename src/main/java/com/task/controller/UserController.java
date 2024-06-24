package com.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.task.dao.UserDao;
import com.task.entity.UserInformation;

@Controller
public class UserController 
{   @Autowired
	UserDao dao;
	@RequestMapping("/registrationPage")
 public String userRegistrationPage() 
 {
	 return "registration";
 }
 
 @RequestMapping("/UserRegistration")
 public String UserRegistrationDetails(UserInformation user)
 {
	System.out.println(user); 
	UserInformation userInformation = dao.userRegistration(user);
	if(userInformation!=null)
	{
		return  "login";
	}
	else
	{
		return "registration";
	}
	
 }
 
 @RequestMapping("/loginPage")
 public String userLoginPage(String emailid,String password,Model model)
 {
	 UserInformation result = dao.loginOperation(emailid, password);
	 System.out.println(result);
	 if(result!=null)
	 {
		 model.addAttribute("msg","Login Successful");
		 return "login";
	 }
	 else
	 {
		 model.addAttribute("msg","Invalid Details");
		 return "login";
	 }
 }
 
 @RequestMapping("/UserLogin")
 public String userLoginDetails()
 {
	 return  "login";
 }
 
 
}

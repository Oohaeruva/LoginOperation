package com.task.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.task.entity.UserInformation;
import com.task.repository.UserRepository;

@Component
public class UserDaoImpl implements UserDao
{
	@Autowired
   UserRepository repo;
	@Override
	
	public UserInformation userRegistration(UserInformation user) 
	{
		UserInformation userInformation = repo.save(user);
		System.out.println(userInformation);
		return userInformation;
				
		
	}
	@Override
	public UserInformation loginOperation(String emailid, String password) 
	{
		
		UserInformation result = repo.findByEmailidAndPassword(emailid, password);
		return result;
	}

}

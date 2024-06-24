package com.task.dao;

import com.task.entity.UserInformation;

public interface UserDao 
{
 UserInformation userRegistration(UserInformation user);
 UserInformation loginOperation(String emailid,String password);
 
}

package com.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.entity.UserInformation;

public interface UserRepository extends JpaRepository<UserInformation, Integer>
{
  UserInformation findByEmailidAndPassword(String emailid,String password);
 
}

package com.vaannila.service;

import com.vaannila.domain.User;

public class UserServiceImpl implements UserServiceTest {

	@Override
	public void add(User user) {
		//Persist the user object here. 
		System.out.println("User added successfully");

	}

}

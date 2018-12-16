package com.ironxi.factory;

import com.ironxi.vo.User;

public class UserFactory {
	public static User newInstance(String name){
		return new User(name);
	}
}

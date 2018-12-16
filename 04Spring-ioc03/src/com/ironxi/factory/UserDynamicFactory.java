package com.ironxi.factory;

import com.ironxi.vo.User;

public class UserDynamicFactory {
	public  User newInstance(String name){
		return new User(name);
	}
}

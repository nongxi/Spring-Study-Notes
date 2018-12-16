package com.ironxi.vo;

public class User {
	public User( String name){
		super();
		this.name=name;
	}
	private String name;
	public void show(){
		System.out.println("创造对象name="+name);
	}
}

package com.ironxi.bean;

public class Hello {
	public Hello(){
		System.out.println("hello 被创建");
	}
	private String name;
	public void setName(String name){
		this.name=name;
	}
	public void show() {		
		System.out.println("Hello,"+name);
	}

}

package com.ironxi.staticproxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Host host=new Host();
		Proxy proxy=new Proxy(host);
		proxy.rent();
	}

}

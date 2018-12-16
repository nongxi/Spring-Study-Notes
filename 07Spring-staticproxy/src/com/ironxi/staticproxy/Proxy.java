package com.ironxi.staticproxy;

public class Proxy implements Rent {

	Host host;

	/**
	 * 通过构造方法传参；通过set方法传参
	 */
	public Proxy() {
	}

	public Proxy(Host host) {
		super();
		this.host = host;
	}

	public void setHost(Host host) {
		this.host = host;
	}

	// 租房
	public void rent() {
		seeHose();
		host.rent();
		fare();
	}

	// 看房
	private void seeHose() {
		System.out.println("带房客看房");
	}

	// 收取中介费
	private void fare() {
		System.out.println("收取中介费用");
	}
}

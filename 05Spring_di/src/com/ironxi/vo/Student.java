package com.ironxi.vo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;



public class Student {
	private String name;
	private Address addr;
	private String[] books;
	private List<String> hobbtis;
	private Map<String,String> cards;
	private Set<String> games;
	private String wife;
	private Properties info;
	
	public void setStudent(String name) {
		this.name = name;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	public void setBooks(String[] books) {
		this.books = books;
	}
	
	public List<String> getHobbtis() {
		return hobbtis;
	}
	public void setHobbtis(List<String> hobbtis) {
		this.hobbtis = hobbtis;
	}
	public Map<String, String> getCards() {
		return cards;
	}
	public void setCards(Map<String, String> cards) {
		this.cards = cards;
	}
	public Set<String> getGames() {
		return games;
	}
	public void setGames(Set<String> games) {
		this.games = games;
	}
	public String getWife() {
		return wife;
	}
	public void setWife(String wife) {
		this.wife = wife;
	}
	
	public void setInfo(Properties info) {
		this.info = info;
	}
	public void show() {
		System.out.println(" name=" + name+" addr=:"+addr.getAddress()+" books="+books);
		for(int i=0;i<books.length;i++){
			System.out.println(books[i]+"  ");
		}
		System.out.println();
		System.out.println("hobbtis="+hobbtis);
		System.out.println("cards="+cards);
		System.out.println("games="+games);
		System.out.println("wife="+wife);
		System.out.println("info="+info);
	}

}

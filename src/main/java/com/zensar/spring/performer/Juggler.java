package com.zensar.spring.performer;

public class Juggler implements Performer {
	private int beanBags;
	public Juggler() {
		// TODO Auto-generated constructor stub
		System.out.println("no argument constructor");
	}

	public Juggler(int beanBags) {
		super();
		this.beanBags = beanBags;
		System.out.println("parameterized constructor of juggler class");
	}
	
	public void perform() {
		
		System.out.println("juggler juggling beanbags" +beanBags);
	}
	

}

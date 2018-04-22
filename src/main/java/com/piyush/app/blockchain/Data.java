package com.piyush.app.blockchain;

public class Data {
	
	String name;
	int balance;

	
	public Data(String name,int balance){
		this.name=name;
		this.balance=balance;
	}
	
	@Override
	public
	String toString() {
		return this.name+" "+this.balance;
	}
	
}

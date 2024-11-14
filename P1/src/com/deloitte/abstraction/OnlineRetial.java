package com.deloitte.abstraction;

public abstract class OnlineRetial {
public String Name;
public int Amount;
public double discount() {
	return Amount*0.05;
}
public abstract double adddiscount();
	
}

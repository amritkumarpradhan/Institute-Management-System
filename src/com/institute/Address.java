package com.institute;

public class Address {
	
	String city;
	String state;
	
	public Address(String city,String state)
	{
		this.city = city;
		this.state = state;
	}
	
	@Override
	public String toString()
	{
		return "(City="+city+",State="+state+")";
	}

}

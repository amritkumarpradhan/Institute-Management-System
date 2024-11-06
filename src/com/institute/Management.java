package com.institute;

public class Management {
	
	private String name;
	private String designation;
	private int age;
	private long number;
	Address add;
	
	public Management(String name,String designation,int age,long number,Address add)
	{
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.number = number;
		this.add = add;
	}
	
	public String get_name()
	{
		return name;
	}
	public void set_name(String name)
	{
		this.name = name;
	}
	
	public String get_designation()
	{
		return name;
	}
	public void set_designation(String designation)
	{
		this.designation = designation;
	}
	
	public int get_age()
	{
		return age;
	}
	public void set_age(int age)
	{
		this.age = age;
	}
	
	public long get_number()
	{
		return number;
	}
	public void set_number(long number)
	{
		this.number = number;
	}
	
	@Override
	public String toString()
	{
		return "Management-[Name="+name+",Designation="+designation+",Age="+age+",Number="+number+",Address="+add+"]";
	}


}

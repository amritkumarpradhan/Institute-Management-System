package com.institute;

public class Trainers {
	
	private String name;
	private String specialization;
	private int age;
	private long number;
	Address add;
	//Id i;
	
	public Trainers(String name,String specialization,int age,long number,Address add)
	{
		this.name = name;
		this.specialization = specialization;
		this.age = age;
		this.number = number;
		this.add = add;
		//i=new Id();
	}
	
	public String get_name()
	{
		return name;
	}
	public void set_name(String name)
	{
		this.name = name;
	}
	
	public String get_specialization()
	{
		return name;
	}
	public void set_specialization(String specialization)
	{
		this.specialization = specialization;
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
		return "Trainer-[Name="+name+",Specialization="+specialization+",Age="+age+",Number="+number+",Address="+add+"]";
	}

}

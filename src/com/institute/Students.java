package com.institute;

import java.util.Scanner;

public class Students {
	
	private String name;
	private int age;
	private long number;
	Address add;
	Course c;
	Id i;
	
	public Students(String name,Course c,int age,long number,Address add)
	{
		this.name = name;
		this.c = c;
		this.age = age;
		this.number = number;
		this.add = add;
		i = new Id();
	}
	
	public String get_name()
	{
		return name;
	}
	public void set_name(String name)
	{
		this.name = name;
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
		return "Student-[Name="+name+",Id="+i+",Age="+age+",Number="+number+",Address="+add+"]";
	}

}

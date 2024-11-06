package com.institute;

public class Id {
	
	static Object got_data = null;
	static int id = 100;
	int nor;
	private static int[] check = new int[10];
	int pos;
	
	public Id()
	{	
		nor=++id;
	}
	
	public void add_Id()
	{
		if(pos>=size()) increase_id();
		check[pos++] = id;
	}
	private void increase_id()
	{
		int[] temp = new int[check.length+5];
		for(int i = 0;i<check.length;i++)
		{
			temp[i] = check[i];
		}
		check = temp;
	}
	
	public int size()
	{
		return pos;
	}
	
	public Object present(int p)
	{
		Linking l = new Linking();
		//Object got_data = null;
		for(int i = 0;i<check.length;i++)
		{
			if(p == check[i])
			{
				got_data = l.get_Member(i);
				System.out.println(got_data);
				break;
			}
		}
		return got_data;
	}
	
	@Override
	public String toString()
	{
		return "("+nor+")";
	}
	

}

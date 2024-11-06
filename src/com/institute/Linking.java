package com.institute;

public class Linking{
	
	 Module start = null;
	 int num = 0;
	
	public void add_Member(Object d)
	{
		if(start == null)
		{
			start = new Module(d);
			num++;
			return;
		}
		
		Module m = new Module(d);
		Module curr = start;
		
		while(curr.n_data != null)
		{
			curr = curr.n_data;
		}
		
		curr.n_data = m;
		num++;
	}
	
	public int count_Individuals()
	{
		return num++;
	}
	
	public Object get_Member(int id)
	{
		if(id <= -1 || id>=count_Individuals())
		{
			throw new IndexOutOfBoundsException();
		}
		Module curr = start;
		for(int i = 0; i<id ;i++)
		{
			curr = curr.n_data;
		}
		return curr.data;
	}
	
	public void delete_Member(int id)
	{
		if(id <= -1 || id >= count_Individuals())
		{
			throw new IndexOutOfBoundsException();
		}
		
		if(id == 0)
		{
			start = start.n_data;
			num--;
			return;
		}
		
		Module curr = start;
		for(int i = 0; i<id-1 ;i++)
		{
			curr = curr.n_data;
		}
		
		curr.n_data = curr.n_data.n_data;
		num--;
	}
	
	public void display_member()
	{
		Module curr = start;
		while(curr != null)
		{
			System.out.println(curr.data);
			curr = curr.n_data;
		}
	}

}

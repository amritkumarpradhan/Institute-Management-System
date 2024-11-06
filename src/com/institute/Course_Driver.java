package com.institute;

import java.util.Scanner;

public class Course_Driver {
	
	public Course get_course()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Which Course he/she want to enroll-");
		System.out.println("1...for Java Full Stack");
		System.out.println("2...for Python Full Stack");
		System.out.println("3...for Mern Stack");
		System.out.println("4...for Testing");
		System.out.print("=>>");
		int n = s.nextInt();
		if(n == 1)
			return new JavaFullStack();
		if(n == 2)
			return new PythonFullStack();
		if(n == 3)
			return new MernStack();
		if(n == 4)
			return new Testing();
		
		return null;
	}

}

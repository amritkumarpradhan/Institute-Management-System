package com.institute;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
	
	public static boolean code_match()
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Encripted Code");
	String str = s.next();
	String regx = "@Amrit";
	
	return Pattern.compile(regx).matcher(str).matches();

	
	}

}

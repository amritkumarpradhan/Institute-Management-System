package com.institute;

import java.util.Scanner;

public class Institute {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Password p = new Password();
		if(p.code_match())
		{
		System.out.println("Enter to Institute Database");
		
		int option = 0;
		int selection;
		
		do
		{
			database();
			option = s.nextInt();
			
			switch(option)
			{
			//case 1
			case 1:
				System.out.println("--------");
				System.out.println("Enter to Management Database");
				Linking m = new Linking();
				do
				{
					menu_Management();
					selection = s.nextInt();
					
					
					switch(selection)
					{
					
					case 1:
						System.out.print("What is this Individual Name-");
						String m_name = s.next();
						
						System.out.print("What is his/her Designation-");
						String m_desig = s.next();
						
						System.out.print("What is his/her Age-");
						int m_age = s.nextInt();
						
						System.out.print("What is his/her Contact Number-");
						long m_number = s.nextLong();
						
						System.out.println("What is his/her Address");
						System.out.print("Enter his/her City-");
						String m_city = s.next();
						System.out.print("Enter his/her Stste-");
						String m_state = s.next();
						
						m.add_Member(new Management(m_name,m_desig,m_age,m_number,new Address(m_city,m_state)));
						m.display_member();
						
						break;
						
					case 2:
						m.display_member();
						System.out.println("Whome You want to Delete");
						System.out.println("Id number 0,1,2,3..........so on");
						System.out.println("Id number starts from 0 to number of employ present with respect to the above List");
						int m_delete = s.nextInt();
						m.delete_Member(m_delete);
						System.out.println("Employ Left in Institute");
						m.display_member();
						
						break;
						
					case 3:
						m.display_member();
						System.out.println("Whome You want to Update");
						System.out.println("Id number 0,1,2,3..........so on");
						System.out.println("Id number starts from 0 to number of employ present with respect to the above List");
						int m_update = s.nextInt();
						System.out.println("Previous Details");
						Object m_data = m.get_Member(m_update);
						System.out.println(m_data);
						System.out.println("Enter what you want to update");
						System.out.println("1---for Name");
						System.out.println("2---for Designation");
						System.out.println("3---for Age");
						System.out.println("4---for Number");
						int m_u = s.nextInt();
						Management management = (Management) m.get_Member(m_update);
						if(m_u== 1)
						{
							System.out.println("Enter New Name");
							management.set_name(s.next());
						}
						else if(m_u== 2)
						{
							System.out.println("Enter New Designation");
							management.set_designation(s.next());
						}
						else if(m_u== 3)
						{
							System.out.println("Enter New Age");
							management.set_age(s.nextInt());
						}
						else if(m_u== 4)
						{
							System.out.println("Enter New Number");
							management.set_number(s.nextLong());
						}
						
						System.out.println("[New Changes Updated]");
						m.get_Member(m_update);
						
						break;
						
					case 4:
						System.out.println("Whome You want to Search");
						System.out.println("Id number 0,1,2,3..........so on");
						System.out.println("Id number starts from 0 to number of employ present with respect to the above List");
						int m_search = s.nextInt();
						Management searched = (Management)m.get_Member(m_search);
						System.out.println(searched);
						
						break;
						
					case 5:
						m.display_member();
						
						break;
						
					case 9:break;
						
					default:
						System.out.println("Enter Vaild Selection");break;
						
					}
					
				}while(selection != 9);
				break;
				
			case 2:
				System.out.println("--------");
				System.out.println("Enter to Trainer Database");
				Linking t = new Linking();
				do
				{
					menu_Trainer();
					selection = s.nextInt();
					
					
					switch(selection)
					{
					
					case 1:
						System.out.print("What is this Trainer Name-");
						String t_name = s.next();
						
						System.out.print("What is his/her Specialization-");
						String t_spec = s.next();
						
						System.out.print("What is his/her Age-");
						int t_age = s.nextInt();
						
						System.out.print("What is his/her Contact Number-");
						long t_number = s.nextLong();
						
						System.out.println("What is his/her Address");
						System.out.print("Enter his/her City-");
						String t_city = s.next();
						System.out.print("Enter his/her Stste-");
						String t_state = s.next();
						
						t.add_Member(new Trainers(t_name,t_spec,t_age,t_number,new Address(t_city,t_state)));
						t.display_member();
						
						break;
						
					case 2:
						t.display_member();
						System.out.println("Whome You want to Delete");
						System.out.println("Id number 0,1,2,3..........so on");
						System.out.println("Id number starts from 0 to number of Trainers present with respect to the above List");
						int t_delete = s.nextInt();
						t.delete_Member(t_delete);
						System.out.println("Employ Left in Institute");
						t.display_member();
						
						break;
						
					case 3:
						t.display_member();
						System.out.println("Whome You want to Update");
						System.out.println("Id number 0,1,2,3..........so on");
						System.out.println("Id number starts from 0 to number of Trainers present with respect to the above List");
						int t_update = s.nextInt();
						System.out.println("Previous Details");
						Object t_data = t.get_Member(t_update);
						System.out.println(t_data);
						System.out.println("Enter what you want to update");
						System.out.println("1---for Name");
						System.out.println("2---for Designation");
						System.out.println("3---for Age");
						System.out.println("4---for Number");
						int t_u = s.nextInt();
						Trainers trainers = (Trainers) t.get_Member(t_update);
						if(t_u== 1)
						{
							System.out.println("Enter New Trainer Name");
							trainers.set_name(s.next());
						}
						else if(t_u== 2)
						{
							System.out.println("Enter New Specialization");
							trainers.set_specialization(s.next());
						}
						else if(t_u== 3)
						{
							System.out.println("Enter New Age");
							trainers.set_age(s.nextInt());
						}
						else if(t_u== 4)
						{
							System.out.println("Enter New Number");
							trainers.set_number(s.nextLong());
						}
						
						System.out.println("[New Changes Updated]");
						t.get_Member(t_update);
						
						break;
						
					case 4:
						System.out.println("Whome Details you Want to Search");
						System.out.println("Id number 0,1,2,3..........so on");
						System.out.println("Id number starts from 0 to number of employ present with respect to the above List");
						int t_search = s.nextInt();
						Trainers searched = (Trainers)t.get_Member(t_search);
						System.out.println(searched);
						
						break;
						
					case 5:
						t.display_member();
						
						break;
						
					case 9:break;
						
					default:
						System.out.println("Enter Vaild Selection");break;
						
					}
					
				}while(selection != 9);
				break;
				
			case 3:
				System.out.println("--------");
				System.out.println("Enter to Student Database");
				Linking st = new Linking();
				do
				{
					menu_Student();
					Id i = new Id();
					selection = s.nextInt();
					
					
					switch(selection)
					{
					
					case 1:
						System.out.print("What is this Student Name-");
						String st_name = s.next();
						
						System.out.print("What is his/her Age-");
						int st_age = s.nextInt();
						
						System.out.print("What is his/her Contact Number-");
						long st_number = s.nextLong();
						
						System.out.println("What is his/her Address");
						System.out.print("Enter his/her City-");
						String st_city = s.next();
						System.out.print("Enter his/her Stste-");
						String st_state = s.next();
						
						st.add_Member(new Students(st_name,new Course_Driver().get_course(),st_age,st_number,new Address(st_city,st_state)));
						i.add_Id();
						st.display_member();
						
						break;
						
					case 2:
						st.display_member();
						System.out.println("Whome You want to Update");
						System.out.println("Id number 0,1,2,3..........so on");
						int st_update = s.nextInt();
						System.out.println("Previous Details");
						Object st_data = st.get_Member(st_update);
						System.out.println(st_data);
						System.out.println("Enter what you want to update");
						System.out.println("1---for Name");
						System.out.println("2---for Age");
						System.out.println("3---for Number");
						int st_u = s.nextInt();
						Students students = (Students) st.get_Member(st_update);
						if(st_u== 1)
						{
							System.out.println("Enter New Student Name");
							students.set_name(s.next());
						}
						else if(st_u== 2)
						{
							System.out.println("Enter New Age");
							students.set_age(s.nextInt());
						}
						else if(st_u== 3)
						{
							System.out.println("Enter New Number");
							students.set_number(s.nextLong());
						}
						
						System.out.println("[New Changes Updated]");
						st.get_Member(st_update);
						break;
						
					case 3:
						System.out.println("Whome Details you Want to Search");
						System.out.println("Enter Id as 0,1,2,3.............");
						int st_search = s.nextInt();
						Students searched = (Students)st.get_Member(st_search);
						System.out.println(searched);
						
						break;
						
					case 4:
						st.display_member();
						
						break;
						
					case 9:break;
						
					default:
						System.out.println("Enter Vaild Selection");break;
						
					}
					
				}while(selection != 9);
				break;
				//Linking m = new Linking();
				//Course_Driver cd = new Course_Driver();
				//System.out.println("Enter");
				//int c = s.nextInt();
				//m.add_Member(new Students("Raveesh Sir","President",35,987654332,new Address("aed","sad"),cd.get_course(c)));
				//m.add_Member(new Students("Ramana Sir","Java",25,976474382,new Address("aed","sad"),cd.get_course(c)));
				//for(int i = 0;i<m.count_Individuals();i++)
					//System.out.println(m.get_Member(i));
				
			case 4:
				exit();
				break;
				
			default:System.out.println("Enter Vaild Option");break;	
			
			}
		}while (option != 4 );
		
		}
		else
			System.out.println("Try Again...........");
		
		

	}
	
	public static void database()
	{
		System.out.println("===========================");
		System.out.println("Enter what you want");
		System.out.println("1-> for Management");
		System.out.println("2-> for Trainer");
		System.out.println("3-> for Student");
		System.out.println("4-> for EXIT the Database");
		System.out.println("Enter your Selection :");
		System.out.print("==>>");
	}
	public static void menu_Management()
	{
		System.out.println("MENU");
		System.out.println("....");
        System.out.println("1: Add Management");
        System.out.println("2: Delete Management");
        System.out.println("3: Update Management");
        System.out.println("4: Search Management");
        System.out.println("5: Display Management");
        System.out.println("9: Exit program");
        System.out.println("Enter your selection : ");
        System.out.print("==>>");
	}

	public static void menu_Trainer()
	{
		System.out.println("MENU");
		System.out.println("....");
        System.out.println("1: Add Trainer");
        System.out.println("2: Delete Trainer");
        System.out.println("3: Update Trainer");
        System.out.println("4: Search Trainer");
        System.out.println("5: Display Trainber");
        System.out.println("9: Exit program");
        System.out.println("Enter your selection : ");
        System.out.print("==>>");
	}
	
	public static void menu_Student()
	{
		System.out.println("MENU");
		System.out.println("....");
        System.out.println("1: Add Student");
        System.out.println("2: Update Student");
        System.out.println("3: Search Student");
        System.out.println("4: Display Students");
        System.out.println("9: Exit program");
        System.out.println("Enter your selection : ");
        System.out.print("==>>");
	}
	
	public static void exit()
	{
		System.out.println("----------Thank You----------");
		System.out.println(">>>>>Please Visit Again<<<<<");
	}
}

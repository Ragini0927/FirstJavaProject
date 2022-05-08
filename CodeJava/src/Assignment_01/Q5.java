package Assignment_01;

import java.util.Scanner;

class Employee
{
	String name;
	int age;
	String department;
	int salary;
	
	Employee(String a, int b, String c, int d)
	{
		this.name = a;
		this.age = b;
		this.department = c;
		if(d < 30000)
		{
			this.salary = d;			
		}
		else
		{
			this.salary = 25000;
		}
		
	}
}

public class Q5 
{
	public static void main (String [] args)
	{
		System.out.println("Name : Ragini Singh");
		Employee arr [] = new Employee [8];
		Scanner sc = new Scanner(System.in);
		Scanner obj = new Scanner(System.in);
		for(int i = 1 ; i <= 8 ; i++)
		{
			System.out.println("Enter the name of employee " + i + " : ");
			String a = obj.nextLine();
			System.out.println("Enter the age of employee " + i + " : ");
			int b = sc.nextInt();
			System.out.println("Enter the department of employee " + i + " : ");
			String department = obj.nextLine();
			System.out.println("Enter the salary of employee " + i + " : ");
			int d = sc.nextInt();
		}
	}
}

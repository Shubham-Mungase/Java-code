package Assignment4;

import java.util.Scanner;

public class WageEmployee extends Employee{
	
	public int computeSalary()
	{
		
		return hrs*rate;
	}
	public void readInfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name Of Employee :");
		setName(sc.next());
		System.out.println("Enter Hour :");
		setHrs(sc.nextInt());
		System.out.println("Enter Rate :");
		setRate(sc.nextInt());
	}
	public void displayInfo()
	{
		System.out.println("Name ="+getName());
		System.out.println("Hour ="+getHrs());
		System.out.println("Rate ="+getRate());
		System.out.println("Total Salary ="+computeSalary());
	}

}

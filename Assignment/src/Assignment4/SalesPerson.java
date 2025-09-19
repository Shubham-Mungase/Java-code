package Assignment4;

import java.util.Scanner;

public class SalesPerson extends WageEmployee1{
	int sales,comm;
	int totalcomm;
	
	public int getSales() {
		return sales;
	}
	public void setSales(int sales)
	{
		this.sales=sales;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}
	@Override
	public int computeSalary() {
		int sal=super.computeSalary();
		 totalcomm = (int)(sales * (comm / 100.0));
		return sal+totalcomm;
		 

	}
	
	
	public void readInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name Of Employee :");
		setName(sc.next());
		System.out.println("Enter Hour :");
		setHrs(sc.nextInt());
		System.out.println("Enter Rate :");
		setRate(sc.nextInt());
		System.out.println("Enter Sales :");
		setSales(sc.nextInt());
		System.out.println("Enter Commission :");
		setComm(sc.nextInt());
		
	}

	public void displayInfo() {
		System.out.println("Name =" + getName());
		System.out.println("Hour =" + getHrs());
		System.out.println("Rate =" + getRate());
		System.out.println("Total Sales ="+getSales());
		System.out.println("Comm On Sales ="+getComm());
		System.out.println("Total Salary =" + computeSalary());
	}

}

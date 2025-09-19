package Assignment3;

import java.util.Scanner;

public class Employee {
	 int id;
	 String name;
	 int dd,mm,yy;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	@Override
	public String toString() {
		return "\nEmployee  :\n id=" + id + "\n name=" + name + "\n DOB =" + dd + "/" + mm + "/" + yy+"\n" ;
	}
	
	public static void  sortEmp(Employee arr[])
	{
		int i,j;
		Employee temp;
		for(i=0;i<arr.length-1;i++)
		{
			for(j=0;j<arr.length-i-1;j++)
			{
				if((arr[j].name).compareTo((arr[j+1].name))>1)
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}	
	}
	
	public void readInfo() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id :");
		setId(sc.nextInt());
		System.out.println("Enter Employee Name :");
		setName(sc.next());
		System.out.println("Enter DOB \n Enter Day :");
		setDd(sc.nextInt());
		System.out.println("Enter Month :");
		setMm(sc.nextInt());
		System.out.println("Enter Year :");
		setYy(sc.nextInt());	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Element :");
		int n=sc.nextInt();
		int i;
		Employee e[]=new Employee[n];
		
		for( i=0;i<n;i++)
		{
			e[i]= new Employee();
			e[i].readInfo();
		}
		sortEmp(e);
		for(i=0;i<n;i++)
		{
			
			System.out.println(e[i].toString());
		}
	}
	 
	 
}

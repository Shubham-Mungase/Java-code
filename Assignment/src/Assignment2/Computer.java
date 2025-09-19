package Assignment2;

import java.util.Scanner;

public class Computer {
	
	private void display() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Brand =");
		String brand=sc.next();
		System.out.println("Enter Speed =");
		int speed=sc.nextInt();
		Processor p=new Processor(brand, speed);
		p.displayDetails();

	}
	
	class Processor
	{
		String brand;
		int speed;
		public Processor(String brand, int speed) {
			super();
			this.brand = brand;
			this.speed = speed;
		}
		public void displayDetails()
		{
			System.out.println("Brand="+brand);
			System.out.println("Speed="+speed);
		}
	}
	
	public static void main(String[] args) {
		
		Computer c=new Computer();
		c.display();
	}

}

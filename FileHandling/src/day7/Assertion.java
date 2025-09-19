package day7;

import java.util.Scanner;

public class Assertion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int num=sc.nextInt();
		assert num>=18:"Not Valid";
		System.out.println("Value is ="+num);
	}
	//to run this program we need to run it on cmd with command java -ea and program-name.java
}

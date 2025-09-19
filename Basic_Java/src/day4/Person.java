package day4;

import java.util.Scanner;

public class Person {
	
	String name;
	int age;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person :name=" + name + ", age=" + age;
	}
	
	private Person check(Person p2) {
		// TODO Auto-generated method stub
		if(p2.age>this.age)
			return p2;
		return this;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Person p1=new Person();
		Person p2=new Person();
		Person p3=new Person();
		
		System.out.println("Enter the value of 1st Person");
		System.out.println("Enter name :");
		p1.setName(sc.next());
		System.out.println("Enter Age :");
		p1.setAge(sc.nextInt());
		
		System.out.println("Enter the value of 2nd Person");
		System.out.println("Enter name :");
		p2.setName(sc.next());
		System.out.println("Enter Age :");
		p2.setAge(sc.nextInt());
		
		p3=p1.check(p2);
		System.out.println("Elder Person is ="+p3);
		
		
		
	}

	
}

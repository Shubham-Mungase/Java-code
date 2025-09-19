package com.hibernate.demo1;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentAppUpdate {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	System.out.println("factory="+factory);
	Session session=factory.openSession();
	Student s1=(Student)session.get(Student.class, 2);
	System.out.println(s1);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter New Percentage :");
	s1.setPer(sc.nextFloat());
	Transaction transaction=session.beginTransaction();
	session.update(s1);
	
	transaction.commit();
	System.out.println("Record Updated");
	Student s2=(Student)session.get(Student.class, 2);
	System.out.println(s2);
	session.close();
}

}

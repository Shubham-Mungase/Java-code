package com.hibernate.demo1;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentAppDelete {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		System.out.println("factory="+factory);
		Session session=factory.openSession();
		Student s1=(Student)session.get(Student.class, 2);
		System.out.println(s1);
		Transaction transaction=session.beginTransaction();
		session.delete(s1);
		transaction.commit();
		System.out.println("Record deleted");
	}

}

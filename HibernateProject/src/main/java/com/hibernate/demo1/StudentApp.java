package com.hibernate.demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentApp {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		System.out.println("factory="+factory);
		Student s1=new Student();
		s1.setRollno(2);
		s1.setStuname("Suhani");
		s1.setPer(78.8f);
		s1.setAddress("Kopergaon");
		Session session =factory.openSession();
		Transaction transaction =session.beginTransaction();
		session.save(s1);
		transaction.commit();
		System.out.println("Record Save");	
	}

}

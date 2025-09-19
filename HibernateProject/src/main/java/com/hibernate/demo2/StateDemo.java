package com.hibernate.demo2;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateDemo {
	public static void main(String[] args) {
		//Transient
		//Persistant
		//Remove
		//Detached
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		System.out.println(factory);
		Student2 s1=new Student2();
		s1.setStuname("Suhanu");
		s1.setPer(95.1f);
		s1.setAddress("Dedgaon");
		s1.setD(new Date());
		s1.setX(5);
		//student trasient
		Session session =factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(s1);
		//student persistent 
		s1.setStuname("Shravani");
		transaction.commit();
		session.close();
		//student detached
		s1.setStuname("Mahesh");
		System.out.println("Student="+s1.toString());
	}

}

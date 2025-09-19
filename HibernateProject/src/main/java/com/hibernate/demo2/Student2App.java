package com.hibernate.demo2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Student2App {
	public static void main(String[] args) throws IOException {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		System.out.println(factory);
		Student2 s1=new Student2();
		s1.setStuname("Shubham");
		s1.setPer(91.1f);
		s1.setAddress("Dedgaon");
		s1.setD(new Date());
		s1.setX(2);
		FileInputStream fin=new FileInputStream("G:\\Shubham-java-codes\\HibernateProject\\src\\main\\java\\com\\hibernate\\demo2\\paint1.jpg");
		byte data[]=new byte[fin.available()];
		fin.read(data);
		s1.setImage(data);
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(s1);
		transaction.commit();
		session.close();
		System.out.println("record save");
		
	}
}

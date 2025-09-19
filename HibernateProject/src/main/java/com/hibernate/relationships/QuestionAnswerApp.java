package com.hibernate.relationships;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QuestionAnswerApp {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		System.out.println("factory="+factory);
		
	/*	Question q1=new Question();
		q1.setQid(1);
		q1.setQuestion("What is java ?");
		Answer a1=new Answer();
		a1.setAns_id(1);
		a1.setAns("Java is OOP");
		a1.setQue(q1);
		Answer a2=new Answer();
		a2.setAns_id(2);
		a2.setAns("Java is Multithreded");
		a2.setQue(q1);
		List<Answer> answers=new ArrayList<Answer>();
		answers.add(a1);
		answers.add(a2);
		q1.setAnswer(answers);
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		session.save(q1);
		session.save(a1);
		session.save(a2);
		t.commit();
		session.close();
		System.out.println("Record save");
		*/
		Session session=factory.openSession();
		Question q2=(Question)session.get(Question.class, 1);
		System.out.println("Que Id="+q2.getQid());
		System.out.println("Question="+q2.getQuestion());
		for(Answer ans:q2.getAnswer())
		{
			System.out.println("Answers ="+ans.getAns());
		}
		
	}

}

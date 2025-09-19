package com.hibernate.demo3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QuestionAnswer5 {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		System.out.println(factory);
//			Question5 q1=new Question5();
//		q1.setQid(1);
//		q1.setQuestion("What is java ?");
//		Answer5 a1=new Answer5();
//		a1.setAid(1);
//		a1.setAnswer("Java is OOP");
//		a1.setQue(q1);
//		Answer5 a2=new Answer5();
//		a2.setAid(2);
//		a2.setAnswer("Java is Multithreded");
//		a2.setQue(q1);
//		List<Answer5> answers=new ArrayList<Answer5>();
//		answers.add(a1);
//		answers.add(a2);
//		q1.setAnswer(answers);
//		Session session=factory.openSession();
//		Transaction t=session.beginTransaction();
//		session.save(q1);
//		//session.save(a1);
//		//session.save(a2);
//		t.commit();
//		session.close();
//		System.out.println("Record save");
//		
		Session session1=factory.openSession();
		Question5 q2=(Question5)session1.get(Question5.class, 1);
		System.out.println("Que Id="+q2.getQid());
		System.out.println("Question="+q2.getQuestion());
		for(Answer5 ans:q2.getAnswer())
		{
			System.out.println("Answers ="+ans.getAnswer());
		}
	}

}

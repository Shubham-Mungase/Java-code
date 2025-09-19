package com.hibernate.demo3;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Answer5 {
	@Id
	private int aid;
	private String answer;
	@ManyToOne
	private Question5 que;
	public Answer5() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer5(int aid, String answer, Question5 que) {
		super();
		this.aid = aid;
		this.answer = answer;
		this.que = que;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question5 getQue() {
		return que;
	}
	public void setQue(Question5 que) {
		this.que = que;
	}

}

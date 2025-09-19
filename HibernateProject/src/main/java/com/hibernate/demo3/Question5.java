package com.hibernate.demo3;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Question5 {
	@Id
	private int qid;
	private String question;
	@OneToMany(mappedBy = "que",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Answer5> answer;
	public Question5() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question5(int qid, String question, List<Answer5> answer) {
		super();
		this.qid = qid;
		this.question = question;
		this.answer = answer;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answer5> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer5> answers) {
		this.answer = answers;
	}
	

}

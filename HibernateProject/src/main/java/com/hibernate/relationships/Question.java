package com.hibernate.relationships;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="Question")
public class Question {
	@Id
	private int qid;
	private String question;
	@OneToMany(mappedBy = "que",fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Answer>answer;
	
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int qid, String question, List<Answer> answer) {
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
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", question=" + question + ", answer=" + answer + "]";
	}
	
	

}

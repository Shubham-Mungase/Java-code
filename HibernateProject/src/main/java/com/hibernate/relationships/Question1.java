package com.hibernate.relationships;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Table;
@Entity
@Table(name="QuestionM2M")
public class Question1 {
	@Id
	private int que_id;
	private String que;
	@JoinTable(name = "que_ans")
	@ManyToAny
	List<Answer1> answers;
	public int getQue_id() {
		return que_id;
	}
	public void setQue_id(int que_id) {
		this.que_id = que_id;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	public List<Answer1> getAnswer() {
		return answers;
	}
	public void setAnswer(List<Answer1> answer) {
		this.answers = answer;
	}
	public Question1(int que_id, String que, List<Answer1> answer) {
		super();
		this.que_id = que_id;
		this.que = que;
		this.answers = answer;
	}
	public Question1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Question1 [que_id=" + que_id + ", que=" + que + ", answer=" + answers + "]";
	}
	
	

}

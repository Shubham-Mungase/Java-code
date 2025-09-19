package com.hibernate.relationships;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="AnswerM2M")
public class Answer1 {
	@Id
	private int ans_id;
	private String ans;
	@ManyToAny
	private List<Question1> questions;
	public Answer1(int ans_id, String ans, List<Question1> questions) {
		super();
		this.ans_id = ans_id;
		this.ans = ans;
		this.questions = questions;
	}
	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAns_id() {
		return ans_id;
	}
	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public List<Question1> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question1> questions) {
		this.questions = questions;
	}
	@Override
	public String toString() {
		return "Answer1 [ans_id=" + ans_id + ", ans=" + ans + ", questions=" + questions + "]";
	}

}

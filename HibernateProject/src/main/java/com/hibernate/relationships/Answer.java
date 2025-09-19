package com.hibernate.relationships;

import com.hibernate.demo3.Question5;

import jakarta.persistence.*;

@Entity
@Table(name = "Answer")
public class Answer {
	@Id
    @Column(name = "AnswerId")
	  private int aid;

    @Column(name = "Answer")
    private String answer;
    @ManyToOne
    @JoinColumn(name = "QuestionID") // This links Answer to Question
    private Question que;

    public Answer() {}

    public Answer(int ans_id, String ans, Question que) {
        this.aid = ans_id;
        this.answer = ans;
        this.que = que;
    }

    public int getAns_id() {
        return aid;
    }

    public void setAns_id(int ans_id) {
        this.aid = ans_id;
    }

    public String getAns() {
        return answer;
    }

    public void setAns(String ans) {
        this.answer = ans;
    }

    public Question getQue() {
        return que;
    }

    public void setQue(Question q1) {
        this.que = q1;
    }

    @Override
    public String toString() {
        return "Answer [ans_id=" + aid + ", ans=" + answer + ", que=" + que + "]";
    }
}

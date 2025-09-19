package com.hibernate.demo1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="student_table")
public class Student {
	@Id
	@Column(name="Student_RollNo")
	private int rollno;
	@Column(name="Student_Name")
	private String stuname;
	@Column(name="Student_Percentage")
	private float per;
	@Transient
	String address;
	public Student(int rollno, String stuname, float per, String address) {
		super();
		this.rollno = rollno;
		this.stuname = stuname;
		this.per = per;
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, String stuname, float per) {
		super();
		this.rollno = rollno;
		this.stuname = stuname;
		this.per = per;
	}
	
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", stuname=" + stuname + ", per=" + per + ", address=" + address + "]";
	}
	
	

}

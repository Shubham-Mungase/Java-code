package com.hibernate.demo2;

import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
@Entity
@Table(name="Stu_Tab")
public class Student2 {
	@Id
	@Column(name="stu_rollno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollno;
	@Column(name="stu_name",length=20)
	private String stuname;
	@Column(name="stu_per")
	private float per;
	@Column(name="stu_address", length=50)
	private String address;
	@Temporal(TemporalType.DATE)
	@Column(name="stu_bdate")
	private Date d;
	@Lob
	@Column(columnDefinition = "BLOB",length = 5000000)
	private byte[] image;
	@Transient
	private int x;
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student2(int rollno, String stuname, float per, String address, Date d, byte[] image, int x) {
		super();
		this.rollno = rollno;
		this.stuname = stuname;
		this.per = per;
		this.address = address;
		this.d = d;
		this.image = image;
		this.x = x;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getD() {
		return d;
	}
	public void setD(Date d) {
		this.d = d;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	@Override
	public String toString() {
		return "Student2 [rollno=" + rollno + ", stuname=" + stuname + ", per=" + per + ", address=" + address + ", d="
				+ d + ", image=" + Arrays.toString(image) + ", x=" + x + "]";
	}
	
	
}

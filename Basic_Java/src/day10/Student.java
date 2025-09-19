package day10;

public class Student extends Person{
	int rollno,per;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String address, long phno,int rollno, int per) {
		super(name, address, phno);
		this.rollno = rollno;
		this.per = per;
		// TODO Auto-generated constructor stub
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getPer() {
		return per;
	}

	public void setPer(int per) {
		this.per= per;
	}

	@Override
	public String toString() {
		String str=super.toString();
		return "Student [rollno=" + rollno + ", salary=" + per + "]"+str;
	}
	
	

}

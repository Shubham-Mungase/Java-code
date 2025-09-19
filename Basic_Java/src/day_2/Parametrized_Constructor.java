package day_2;

public class Parametrized_Constructor {

	int rollno=0;
	String name=null;
	float per=0f;
	
	
	
	public Parametrized_Constructor(int rollno, String name, float per) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.per = per;
	}



	@Override
	public String toString() {
		return "Default_Constructor [\n rollno=" + rollno + ", \n name=" + name + ", \n per=" + per + "]";
	}
	public static void main(String[] args) {
		Parametrized_Constructor pc=new Parametrized_Constructor(1,"Shubham",50.5f);
		System.out.println(pc);
	}
}

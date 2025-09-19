package day_2;

public class Default_Constructor {

	int rollno=0;
	String name=null;
	float per=0f;
	
	public Default_Constructor() {
		super();
		this.rollno = 1;
		this.name = "Shubham";
		this.per = 100.1f;
	}
	
	
	
	@Override
	public String toString() {
		return "Default_Constructor [rollno=" + rollno + ", name=" + name + ", per=" + per + "]";
	}



	public static void main(String[] args) {
		Default_Constructor dc=new Default_Constructor();
		System.out.println(dc.toString());
		
		
	}
	
}

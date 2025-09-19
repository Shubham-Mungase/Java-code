package day10;

public class Person {

	private String name,address;
	private long  phno;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(String name, String address, long phno) {
		this.name = name;
		this.address = address;
		this.phno = phno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public long getPhno() {
		return phno;
	}


	public void setPhno(long phno) {
		this.phno = phno;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", phno=" + phno + "]";
	}
	
	
	
	
	
}

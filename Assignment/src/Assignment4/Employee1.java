package Assignment4;

public class Employee1 {
	
	String name ;
	int id;
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee1(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", id=" + id + "]";
	}
	

}

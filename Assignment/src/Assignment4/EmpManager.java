package Assignment4;

public class EmpManager {
	
	public static void main(String[] args) {
		Manager m=new Manager();
		m.readInfo();
		System.out.println(m);
		int sal=m.computeSalary();
		System.out.println("Total Salary ="+sal);
	}

}

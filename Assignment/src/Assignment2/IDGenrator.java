package Assignment2;

public class IDGenrator {
	
	static int nextId=0;
	
	public static int genrateID()
	{
		return nextId++;
	}
	
	public static void main(String[] args) {
		
		IDGenrator.genrateID();
		IDGenrator.genrateID();
		IDGenrator.genrateID();
		int a=IDGenrator.genrateID();
		System.out.println("Id="+a);
	}

}

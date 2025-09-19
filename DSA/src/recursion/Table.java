package recursion;

public class Table {
	
	public static void main(String[] args) {
		table(5);
	}

	private static int table(int i) {
		if(i==10)
			return 1;
		System.out.println("\t"+i);
		return i+table(i*i);
		
	}

}

package Assignment3;

public class CompareStrings {

	public static void main(String[] args) {
		String s1="Shubham";
		String s2="Shubham";
		compare(s1,s2);
		String s3=new String("Shubham");
		String s4=new String("Shubham");
		compare(s3,s4);
	}

	private static void compare(String s1, String s2) {
		// TODO Auto-generated method stub
		System.out.println("s1==s2"+s1==s2);
		System.out.println("Equal="+s1.equals(s2));
		
		
	}
}

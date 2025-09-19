package day7Wrapper_String;

public class String1 {

	public static void main(String[] args) {
		String str="Wel Come";
		System.out.println("Length of str ="+str.length());
		System.out.println("Index Of 'C' ="+str.indexOf('C'));
		System.out.println("Index of 'C' ="+str.indexOf('C',3));
		System.out.println("Last Index Of 'C' ="+str.lastIndexOf('C'));
		System.out.println("Char at 3 position ="+str.charAt(3));
		System.out.println("Lower Case ="+str.toLowerCase());
		System.out.println("Upper Case ="+str.toUpperCase());
		System.out.println("Substring ="+str.substring(1,5));
		if(str.startsWith("W"))
		{
			System.out.println("Starts with w");
			
		}
		else
			System.out.println("Not Starts with w");
	}
}

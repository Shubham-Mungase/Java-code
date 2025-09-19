package day7Wrapper_String;

import java.io.IOException;

public class Wrapper2 {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter Character :");
		char ch=(char)System.in.read();
		ch=Character.toLowerCase(ch);
		System.out.println("Lower Case ="+ch);
		ch=Character.toUpperCase(ch);
		System.out.println("Upper Case="+ch);
		ch=Character.toTitleCase(ch);
		System.out.println("Title Case="+ch);
		if(Character.isLetter(ch))
		System.out.println("Char is letter");
		else
			System.out.println("Char is not letter");
	}
}

package stack;

import java.util.ListIterator;
import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {

		Stack stack=new Stack();
		stack.push("one");
		stack.push("two");
		stack.push("Three");
		stack.push("four");
		stack.push("five");
		stack.push("six");
		System.out.println("Popped="+stack.pop());
		System.out.println("Peeked="+stack.peek());
		System.out.println("Popped="+stack.pop());
		System.out.println("Peeked="+stack.peek());
		if(stack.empty())
		{
			System.out.println("Stack is empty");
			
		}
		else
		{
			System.out.println("Stack is not empty");
		}
		
//		System.out.println("Stack Elements :");
//		ListIterator lit=stack.listIterator(stack.size());
//		while(lit.hasNext())
//		{
//			String str=(String)lit.next();
//			System.out.println(str);
//		}
		ListIterator lit=stack.listIterator(stack.size());
		while(lit.hasPrevious())
		{
			String str=(String)lit.previous();
			System.out.println(str);
		}
	}
}

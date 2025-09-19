package Assignment2;

public class Counter {

	static int count=0;

	public Counter() {
		super();
		this.count++;
	}
	public void display() {
		// TODO Auto-generated method stub
		 System.out.println("Count="+count);

	}
	 public static void main(String[] args) {
		Counter cnt1=new Counter();
		Counter cnt2=new Counter();
		cnt2.display();
		Counter cnt3=new Counter();
		cnt3.display();
	}
	
}

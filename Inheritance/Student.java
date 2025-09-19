import java.util.*;
class Student extends Person
{
	protected int rno;
	protected float per;
	public void readStu()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll number : ");
		rno=sc.nextInt();
		System.out.println("Enter Persentage : ");
		per=sc.nextFloat();
	}
	public void displayStu()
	{
		System.out.println("Roll Number ="+rno);
		System.out.println("Persentage ="+per);
	}
}

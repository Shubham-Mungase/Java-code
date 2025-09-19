package Assignment2;

import java.util.Scanner;

public class Account {
	
	private int acc_no,bal;
	private String cust_name;
	private char acc_type;
	
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int acc_no, int bal, String cust_name, char acc_type) {
		super();
		this.acc_no = acc_no;
		this.bal = bal;
		this.cust_name = cust_name;
		this.acc_type = acc_type;
	}
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public char getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(char acc_type) {
		this.acc_type = acc_type;
	}
	public void deposite(int acn, int amt)
	{
		
			if(this.acc_no==acn)
			{
					bal=bal+amt;
			}
		
	}
	public void withdraw(int acn, int amt)
	{
		if(this.acc_no==acn)
		{
		if(acc_type=='S')
		{
			if(bal-amt>=1000)
			{
				bal=bal-amt;
			}
			else
			{
				System.out.println("Insufficient Fund");
			}
		}
		else
		{
			if(bal-amt>=10000)
			{
				bal=bal-amt;
			}
			else
			{
				System.out.println("Insufficient Fund");
			}
		}
	}
		
	}
	
	
	@Override
	public String toString() {
		return "Account [acc_no=" + acc_no + ", bal=" + bal + ", cust_name=" + cust_name + ", acc_type=" + acc_type
				+ "]";
	}
	private void readInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account No :");
		setAcc_no(sc.nextInt());	
		System.out.println("Enter Customer Name :");
		setCust_name(sc.next());
		System.out.println("S->SAVING\nC->CURRENT");
		System.out.println("Enter Account Type :");
		setAcc_type(sc.next().charAt(0));
		System.out.println("Enter Account Balance :");
		setBal(sc.nextInt());
		//b.setAcc_type((char)System.in.read());
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		int num;
		System.out.println("How Many Customer :");
		num=sc.nextInt();
		Account b[]=new Account[num];
		do
		{
			System.out.println("1->Enter info");
			System.out.println("2->Display info");
			System.out.println("3->Deposite Amount");
			System.out.println("4->Withdraw Amount");
			System.out.println("5->Exit");
			System.out.println("Enter Your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				
				
				for(int i=0;i<num;i++)
				{
					b[i]=new Account();
					b[i].readInfo();
				}
				break;
			case 2:
				for(int i=0;i<num;i++)
				System.out.println("Info Of Account :\n"+b[i].toString());
				break;
			case 3:
				System.out.println("Enter Account Number :");
				int acn=sc.nextInt();
				System.out.println("Enter the Deposite Amount :");
				int amt=sc.nextInt();
				for(int i=0;i<num;i++)
				{
					b[i].deposite(acn,amt);
				}
					
				break;
			case 4:
				System.out.println("Enter Account Number :");
				 acn=sc.nextInt();
				System.out.println("Enter the WithDraw Amount :");
				amt=sc.nextInt();
				for(int i=0;i<num;i++)
				{
					b[i].withdraw(acn,amt);
				}
				break;
			case 5:
				System.out.println("Exited");
				break;
			
			}
		}while(choice!=5);
		
	}
}

package day6ApplicationProg;

import java.util.Scanner;

//create a class bank  which has member accno ,name,acctype,balance
//impliment following operation 1)readinfo 2)Display info 3)Deposit amount 4)withdraw amount
public class Bank {

	private int acc_no,bal;
	private String cust_name;
	private char acc_type;
	
	
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(int acc_no, int bal, String cust_name, char acc_type) {
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
	@Override
	public String toString() {
		return "Bank [acc_no=" + acc_no + ", bal=" + bal + ", cust_name=" + cust_name + ", acc_type=" + acc_type + "]";
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
	
	public void withDraw(int amt)
	{
	
		if(acc_type=='S')
		{
			if(bal-amt>=1000)
				bal=bal-amt;
			else
				System.out.println("Insufficient amount");
		}
		else
		{
			if(bal-amt>=10000)
				bal=bal-amt;
			else
				System.out.println("Insufficient amount");
		}
		
	}
	public void deposite(int amt)
	{
		bal=bal+amt;
	}
	
	public static void main(String[] args) {
		Bank b=new Bank();
		Scanner sc=new Scanner(System.in);
		int choice;
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
				b.readInfo();
				break;
			case 2:
				System.out.println("Info Of Account :\n"+b);
				break;
			case 3:
				System.out.println("Enter the Deposite Amount :");
				int amt=sc.nextInt();
				b.deposite(amt);
				break;
			case 4:
				System.out.println("Enter the WithDraw Amount :");
				amt=sc.nextInt();
				b.withDraw(amt);
				break;
			case 5:
				System.out.println("Exited");
				break;
			
			}
		}while(choice!=5);
		
	}

	
	
}

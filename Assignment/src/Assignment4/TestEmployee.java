package Assignment4;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WageEmployee we[] = new WageEmployee[10];
		Manager m[] = new Manager[10];
		SalesPerson sp[] = new SalesPerson[10];
		int choice;
		System.out.println("How many Employee");
		int num = sc.nextInt();
		do {
			System.out.println("1->Read Info Of WageEmployee");
			System.out.println("2->Read Info Of SalesPerson");
			System.out.println("3->Read Info Of Manager");
			System.out.println("4->Display Info Of WageEmployee");
			System.out.println("5->Display Info Of SalesPerson");
			System.out.println("6->Display Info Of Manager");
			System.out.println("7->Exit");
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				for (int i = 0; i < num; i++) {
					we[i] = new WageEmployee();
					we[i].readInfo();
				}
				break;
			case 2:

				for (int i = 0; i < num; i++) {
					m[i] = new Manager();
					m[i].readInfo();
				}
				break;
			case 3:
				for (int i = 0; i < num; i++) {
					sp[i] = new SalesPerson();
					sp[i].readInfo();
				}
				break;
			case 4:
				for(int i=0;i<num;i++)
				{
					we[i].displayInfo();
				}
				break;
			case 5:
				for(int i=0;i<num;i++)
				{
					System.out.println(m[i].toString());
				}
				break;
			case 6:
				for(int i=0;i<num;i++)
				{
					sp[i].displayInfo();
				}
				break;
			case 7: 
				break;
			}

		} while(choice!=7);
	}
}

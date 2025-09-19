package linkedList;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
class LinkedList {
	 Node head;

	// insert the node at end
	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	// insert the node at beginning
	public void insertAtBegining(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	// delete from Begining

	public void deleteFromBegining() {
		if (head == null) {
			System.out.println("List is empty");
		}
		head = head.next;
	}

	// delete from End
	public void deleteFromEnd() {
		Node temp = head, pre = head;

		if (temp == null) {
			System.out.println("List is empty ");
		}
		while (temp.next != null) {
			pre = temp;
			temp = temp.next;
		}
		if (pre == temp) {
			head = null;
		} else {
			temp.next = null;
		}
	}

	// Traversing
	public void display() {
		Node temp = head;
		if (head == null) {
			System.out.println("List is empty");
		}
		while (temp != null) {
			System.out.print("|" + temp.data + "|->");
			temp = temp.next;
		}
		System.out.println("Null\n\n");

	}
	//insert the element at specific position
	public void insertAtSpecificPos(int val2, int pos) {
		Node newNode = new Node(val2);
		if (pos == 1) {
			newNode.next = head;
			head = newNode;
			return;
		}
		Node current = head;
		int cpos = 1;
		while (current != null && cpos < pos - 1) {
			current = current.next;
			cpos++;
		}
		if (current == null) {
			System.out.println("Position out of bound");
			return;
		}

		newNode.next = current.next;
		current.next = newNode;

	}
	//delete the element at specific position
	public void deleteAtSpecificPos(int pos) {
		Node current = head;
		if (pos == 1) {
			head = head.next;
			return;
		}
		int cpos = 1;
		while (current != null && cpos < pos - 1) {
			current = current.next;
			cpos++;
		}
		if (current == null && current.next == null) {
			System.out.println("List is empty");
		}
		Node nodeToDelete = current.next;
		current.next = nodeToDelete.next;

		nodeToDelete = null;

	}

}

public class CreateLinkedList {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		Scanner sc = new Scanner(System.in);

		int choice = 0;
		String str;
		do {
			System.out.println("0->Create Linked List");
			System.out.println("1->Insert At Begining");
			System.out.println("2->Insert At End");
			System.out.println("3->Insert At Specific Position");
			System.out.println("4->Delete From Begining");
			System.out.println("5->Delete From End");
			System.out.println("6->Delete At Specific Position");
			System.out.println("7->Display");
			System.out.println("8->Exit");
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				do {
					System.out.println("Enter The Element :");
					int val = sc.nextInt();
					li.insert(val);
					System.out.println("Do you want to continue then press y");
					str = sc.next();
				} while (str.equals("y"));
				break;
			case 1:
				System.out.println("Enter The Element :");
				int val = sc.nextInt();
				li.insertAtBegining(val);
				break;
			case 2:
				System.out.println("Enter The Element :");
				int val1 = sc.nextInt();
				li.insert(val1);
				break;
			case 3:
				System.out.println("Enter the Element :");
				int val2 = sc.nextInt();
				System.out.println("Enter The Position");
				int pos = sc.nextInt();
				li.insertAtSpecificPos(val2, pos);
				break;
			case 4:
				li.deleteFromBegining();
				break;
			case 5:
				li.deleteFromEnd();
				break;
			case 6:
				System.out.println("Enter The Position");
				int pos1 = sc.nextInt();
				li.deleteAtSpecificPos(pos1);
				break;
			case 7:
				li.display();
				break;

			}
		} while (choice != 8);
	}

}

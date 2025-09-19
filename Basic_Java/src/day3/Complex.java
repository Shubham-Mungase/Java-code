package day3;

import java.util.Scanner;

public class Complex {

	int img,real;

	public int getImg() {
		return img;
	}

	public void setImg(int img) {
		this.img = img;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}
	public static void main(String[] args) {
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The 1st Complex Number");
		System.out.println("Enter The Real Part:");
		c1.setReal(sc.nextInt());
		System.out.println("Enter The Img Part:");
		c1.setImg(sc.nextInt());

		System.out.println("Enter The 2nd Complex Number");
		System.out.println("Enter The Real Part:");
		c2.setReal(sc.nextInt());
		System.out.println("Enter The Img Part:");
		c2.setImg(sc.nextInt());
		System.out.println("Before Swap=");
		System.out.println("c1="+c1.getReal()+"+"+c1.getImg()+"i");
		System.out.println("c2="+c2.getReal()+"+"+c2.getImg()+"i");
		swap(c1,c2);
		System.out.println("After Swap=");
		System.out.println("c1="+c1.getReal()+"+"+c1.getImg()+"i");
		System.out.println("c2="+c2.getReal()+"+"+c2.getImg()+"i");
		
		
	}

	private static void swap(Complex c1, Complex c2) {
		Complex temp=new Complex();
		temp.real=c1.real;
		temp.img=c1.img;
		c1.real=c2.real;
		c1.img=c2.img;
		c2.real=temp.real;
		c2.img=temp.img;
		
	}
}

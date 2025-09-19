package day3;

import java.util.Scanner;
//pass object as a parameter
public class ComplexAdd {
	int real, img;

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImg() {
		return img;
	}

	public void setImg(int img) {
		this.img = img;
	}
	private void add(ComplexAdd c1, ComplexAdd c2) {
		// TODO Auto-generated method stub
		real = c1.real + c2.real;
		img = c1.img + c2.real;

	}
	private void mul(ComplexAdd c1, ComplexAdd c2) {
		// TODO Auto-generated method stub
		real=c1.real*c2.real-c1.img*c2.img;
		img=c1.real*c2.img+c1.img*c2.real;
		
	}


	public static void main(String[] args) {
		ComplexAdd c1 = new ComplexAdd();
		ComplexAdd c2 = new ComplexAdd();
		ComplexAdd c3 = new ComplexAdd();
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
		c3.add(c1, c2);
		System.out.println("Addition Of "
				+ "Two Complex Number =" + c3.getReal() + "+" + c3.getImg()+"i");
		
		c3.mul(c1,c2);
		System.out.println("Multiplication"
				+ " Of Two Complex Number =" + c3.getReal() + "+" + c3.getImg()+"i");
		
	}

	
	

}

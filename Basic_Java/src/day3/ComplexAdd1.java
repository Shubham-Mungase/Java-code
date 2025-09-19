package day3;

import java.util.Scanner;
//return object
public class ComplexAdd1 {
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
	private  ComplexAdd1 add(ComplexAdd1 c2) {
		// TODO Auto- method stub
		ComplexAdd1 c3=new ComplexAdd1();
		c3.real =real + c2.real;
		c3.img = img + c2.real;
		return c3;

	}
	private ComplexAdd1 mul(ComplexAdd1 c2) {
		// TODO Auto-generated method stub
		ComplexAdd1 c3=new ComplexAdd1();
		c3.real=real*c2.real-img*c2.img;
		c3.img=real*c2.img+img*c2.real;
		return c3;
		
	}


	public static void main(String[] args) {
		ComplexAdd1 c1 = new ComplexAdd1();
		ComplexAdd1 c2 = new ComplexAdd1();
		ComplexAdd1 c3 = new ComplexAdd1();
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
		c3=c1.add(c2);
		System.out.println("Addition Of "
				+ "Two Complex Number =" + c3.getReal() + "+" + c3.getImg()+"i");
		
		c3=c1.mul(c2);
		
		System.out.println("Multiplication"
				+ " Of Two Complex Number =" + c3.getReal() + "+" + c3.getImg()+"i");
		
	}

	
	

}

package day12;

public class Rect implements Shape{

	
	float l,b,h,a,v;
	
	
	

	public Rect() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setL(float l) {
		this.l = l;
	}

	public void setB(float b) {
		this.b = b;
	}

	public void setH(float h) {
		this.h = h;
	}

	public float getA() {
		return a;
	}

	public float getV() {
		return v;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		a=l*b;
		
	}

	@Override
	public void volume() {
		// TODO Auto-generated method stub
		v=l*b*h;
		
	}
	

}

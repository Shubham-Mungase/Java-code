package day11;

public class ReactAngle extends Shape {

	protected float l,b,h;
	
	
	public void setL(float l) {
		this.l = l;
		//System.out.println("length="+this.l);
	}

	public void setB(float b) {
		this.b = b;
	}

	public void setH(float h) {
		this.h = h;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	area=l*b;
		
	}

	@Override
	public void volume() {
		// TODO Auto-generated method stub
		
		volume=l*b*h;
		
	}

}

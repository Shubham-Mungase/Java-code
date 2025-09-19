package Assignment5;

public class Rectangle extends Shape{

	float length;
	float breadth;
	float area;
	public void setLength(float length) {
		this.length = length;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	
	@Override
	public void area() {
		area=length*breadth;
		System.out.println("Area of RectAngle ="+area);
	}

}

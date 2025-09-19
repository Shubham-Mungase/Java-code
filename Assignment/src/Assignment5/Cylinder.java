package Assignment5;

public class Cylinder extends Shape {

	// 2π r h + 2π r².
	float radius;
	float height;
	float area;
	final float PI=3.14f;
	public void setRadius(float radius) {
		this.radius=radius;
	}

	public void setHeight(float height) {
		this.height=height;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		area=(2*this.PI*radius*height)+(2*this.PI*radius*radius);
		System.out.println("Area of Cylinder ="+area);
	}

}

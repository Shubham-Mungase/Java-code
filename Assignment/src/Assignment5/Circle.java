package Assignment5;

public class Circle extends Shape{

	float area;
	float radius;
	final float PI=3.14f;
	
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	@Override
	public void area() {
		area=this.PI*radius*radius;
		System.out.println("Area Of Circle ="+area);
	}
	

}

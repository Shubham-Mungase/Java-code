package day12;

public class Circle implements Shape{

	float radius;
	float area;
	float volume;
	

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float getArea() {
		return area;
	}

	public float getVolume() {
		return volume;
	}

	

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		area=PI*radius*radius;
	}

	@Override
	public void volume() {
		// TODO Auto-generated method stub
		
		volume=(4/3)*PI*radius*radius*radius;
		
		
	}

}

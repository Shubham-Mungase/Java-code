package day11;

public class Circle extends Shape{

	private float radius;
	
	public void setRadius(float radius) {
		this.radius = radius;
	}
	@Override
	public void area() {
		area = (3.14f*radius*radius);
	}

	@Override
	public void volume() {
		// TODO Auto-generated method stub
		
	}

}

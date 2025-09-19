package Assignment5;

public class Square extends Shape{

	float side;
	float area;

	public void setSide(float side) {
		this.side = side;
	}

	
	@Override
	public void area() {
		
		area=side*side;
		System.out.println("Area Of Square ="+area);
	}

}

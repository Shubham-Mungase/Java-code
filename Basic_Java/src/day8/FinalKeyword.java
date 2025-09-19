package day8;

class Circle
{
	private float r,a;
	final float PI=3.14f;
	public float getA() {
		return a;
	}
	public void setR(float r) {
		this.r = r;
	}
	public void area()
	{
		a=PI*r*r;
	}
	
	
	
}
public class FinalKeyword {
	public static void main(String[] args) {
		Circle obj=new Circle();
		obj.setR(4);
		obj.area();
		System.out.println("Area="+obj.getA());
	}

}

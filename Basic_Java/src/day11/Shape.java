package day11;

abstract public class Shape {
	protected float area,volume;

	public float getArea() {
		return area;
	}

	public float getVolume() {
		return volume;
	}
	public abstract void area();
	public abstract void volume();
}

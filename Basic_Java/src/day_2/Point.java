package day_2;
public class Point {
	private int x;
	private int y;
	public Point() {
		x=10;
		y=20;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point(int a) {
		this.x = a;
		this.y = a;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public static void main(String[] args) {
		Point p=new Point();
		System.out.println(p);
		Point p1=new Point(2,3);
		System.out.println(p1);
		Point p2=new Point(5);
		System.out.println(p2);
	}}

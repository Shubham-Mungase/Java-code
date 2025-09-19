package day_2;
public class Point9
{
	int x,y;
	public Point9(int i, int j) {
		this.x=i;
		this.y=j;
	}
	public void show(){
		System.out.println("Point="+x+","+y);
	}
	public static void change(Point9 a){
		int temp;
		temp=a.x;
		a.x=a.y;
		a.y=temp;
	}
	public static void main(String args[]){
		Point9 p1=new Point9(9,5);
		System.out.println("Before Change");
		p1.show();
		Point9.change(p1);
		System.out.println("After Change=");
		p1.show();
	}}

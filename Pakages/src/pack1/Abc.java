package pack1;
import pack2.pack3.*;
public class Abc {
	public void show()
	{
		System.out.println("public show");
	}
	private void show1()
	{
		System.out.println("private show1");
	}
	protected void show2()
	{
		System.out.println("protected show2");
	}
	void show3()
	{
		System.out.println("default show3");
	}
	
	public static void main(String[] args) {
		Demo d=new Demo();
		d.demo();
	}

}

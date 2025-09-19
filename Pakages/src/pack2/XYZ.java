package pack2;
import pack1.*;
public class XYZ extends Abc{
	
	public void display()
	{
		show();
		//show1(); error
		show2();
		//show3(); error
	}

	public static void main(String[] args) {
		XYZ xyz=new XYZ();
		xyz.display();
	}
}

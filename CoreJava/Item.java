class Item
{
	private int ino;
	private static int ct;
	void set(int x)
	{
		ino=x;
		ct++;
	}
	void show()
	{
	System.out.println("Item no = "+ino);
	System.out.println("Count = "+ct);
	}
	public static void main(String args[])
	{
		Item i1=new Item();
		Item i2=new Item();
		Item i3=new Item();
		i1.set(100);
		i1.show();
		i2.set(200);
		i1.show();
		i2.show();
		i3.set(300);
		i1.show();
		i2.show();
		i3.show();
		
	}
}

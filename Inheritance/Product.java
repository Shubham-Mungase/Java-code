interface marker
{
	
}
class Product implements marker
{
	int id;
	String name;
	float cost;
	int qty;
	static int ct=0;
	Product()
	{
		this.id=id;
		this.name=name;
		this.cost=cost;
		this.qty=qty;
		this.ct++;
	}
	Product(int id,String name,float cost,int qty)
	{
		
		this.id=id;
		this.name=name;
		this.cost=cost;
		this.qty=qty;
		this.ct++;
	}
	public void display()
	{
		System.out.println("Id="+id);
		System.out.println("Name="+name);
		System.out.println("Cost="+cost);
		System.out.println("Quantity="+qty);
		System.out.println("count="+ct);
	}
	
}


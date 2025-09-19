package day11;

public class Book extends Publication{

	private int pagetct;

	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String title, float price,int pagetct) {
		super(title, price);
		this.pagetct = pagetct;
		// TODO Auto-generated constructor stub
	}
	public int getPagetct() {
		return pagetct;
	}
	public void setPagetct(int pagetct) {
		this.pagetct = pagetct;
	}
	
	public static void checkPagetct(Book b[],int n,int nb)
	{
		for(int i=0;i<nb;i++)
		{
			if(b[i].pagetct>=n)
			{
				System.out.println(" "+b[i]);
			}
		}
	}
	
	public static void sort(Book b[],int nt)
	{
		int i,j;
		Book temp;
		for(i=0;i<nt-1;i++)
		{
			for(j=0;j<nt-i-1;j++)
			{
				if((b[j].getTitle()).compareTo((b[j+1]).getTitle())>0)
				{
					temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
				}
			}
		}
	}
	@Override
	public String toString() {
		String str=super.toString();
		return "Book [pagetct=" + pagetct + "]\t" +str;
	}
	
	
	
}

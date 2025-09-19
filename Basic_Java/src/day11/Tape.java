package day11;

public class Tape extends Publication{
	int playtime;

	public Tape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tape(String title, float price) {
		super(title, price);
		// TODO Auto-generated constructor stub
	}

	public int getPlaytime() {
		return playtime;
	}

	public void setPlaytime(int playtime) {
		this.playtime = playtime;
	}
	
	public boolean checkPlayTime(int n)
	{
		if(playtime>n)
			return true;
		else
			return false;
	}
	public static void sort(Tape t[],int nt)
	{
		int i,j;
		Tape temp;
		for(i=0;i<nt-1;i++)
		{
			for(j=0;j<nt-i-1;j++)
			{
				if((t[j].getTitle()).compareTo((t[j+1]).getTitle())>0)
				{
					temp=t[j];
					t[j]=t[j+1];
					t[j+1]=temp;
				}
			}
		}
	}
	
	@Override
	public String toString() {
		String str=super.toString();
		return "Tape [playtime=" + playtime + "] "+str;
	}
	

}

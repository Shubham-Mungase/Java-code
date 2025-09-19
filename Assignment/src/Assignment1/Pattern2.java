package Assignment1;

public class Pattern2 {
	public static void main(String[] args) {
		for(char i='F';i>'A';i--)
		{
			for(char j='A';j<i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

class ForWhile1
{
		public static void main(String [] args)
		{
			int j=1;
			for(int i=2;i<=10;i++)
			{
				j=1;
				while(j<=10)
				{
					System.out.print("\t"+i*j);
					j++;
				}
				System.out.printf("\n");
			}
		}
}
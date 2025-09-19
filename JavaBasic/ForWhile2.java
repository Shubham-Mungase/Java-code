class ForWhile2
{
		public static void main(String [] args)
		{
			int j=1;
			for(int i=1;i<=10;i++)
			{
				j=2;
				while(j<=10)
				{
					System.out.print("\t"+i*j);
					j++;
				}
				System.out.printf("\n");
			}
		}
}
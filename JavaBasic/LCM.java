import java.io.*;
class LCM
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int num1,num2,temp=0;
		System.out.println("Enter The First Number : ");
		num1=Integer.parseInt(br.readLine());
		System.out.println("Enter The Second Number : ");
		num2=Integer.parseInt(br.readLine());
		for(int i=1;i<=num1;i++)
		{
			if(num1%i==0&&num2%i==0)
			{
				temp=i;
			}
		}
		int lcm=(num1*num2)/temp;
		System.out.println("LCM="+lcm);
	}
}
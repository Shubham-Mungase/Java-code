import java.io.*;
class Maximum 
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int num1,num2,res;
		System.out.println("Enter First Number :");
		num1=Integer.parseInt(br.readLine());
		System.out.println("Enter Second Number :");
		num2=Integer.parseInt(br.readLine());
		/*if(num1>num2)
		{
			System.out.println(num1+"is Maximum");
		}
		else if(num2>num1)
		{
			System.out.println(num2+"is Maximum");
		}
		else
		{
			System.out.println(num1+","+num2+" Number is Equal");
		}*/
			
			if(num1==num2)
			{
				System.out.println("Number are Equal");
				
			}
			else
			{
				res=num1>num2?num1:num2;
				System.out.println(res+" is Maximum");
			}
	}
}
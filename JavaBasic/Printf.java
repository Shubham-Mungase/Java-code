class Printf
{
	public static void main(String [] args)
	{
		int num=567;
		System.out.printf("Cyber%6dSuccess\n",num);
		System.out.printf("Cyber%-6dSuccess\n\n",num);
		
		float per=79.99f;
		System.out.printf("Cyber%8.2fSuccess\n",per);
		System.out.printf("Cyber%-8.2fSuccess\n\n",per);
		
		String str="Dimple";
		System.out.printf("Cyber%10sSuccsess\n",str);
		System.out.printf("Cyber%-10sSuccsess\n\n",str);
	}
}
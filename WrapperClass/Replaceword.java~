import java.io.*;
class Replaceword
{
	public static void main(String args[]) throws IOException
	{
		String str,wordf,wordr;
		int ct=0,i=-1;
		BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");
		str=br.readLine();
		System.out.println("Enter word to be find :");
		wordf=br.readLine();
		System.out.println("Enter word to be replace :");
		wordr=br.readLine();
		StringBuffer sb=new StringBuffer(str);
		int lf=wordf.length();
		while(true)
		{
			i=str.indexOf(wordf);
			if(i==-1)
			{
				break;
			}
			sb=sb.replace(i,i+lf,wordr);
			str=sb.toString();
		}
		System.out.println("String after replace :"+str);
	}
}

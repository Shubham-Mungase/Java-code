import java.io.*;
class Deleteword
{
	public static void main(String args[]) throws IOException
	{
		String str,word;
		int i=-1;
		BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");
		str=br.readLine();
		System.out.println("Enter word to be delete :");
		word=br.readLine();
		StringBuffer sb =new StringBuffer(str);
		int lf=word.length();
		while(true)
		{
			i=str.indexOf(word);
			if(i==-1)
			break;
			sb=sb.delete(i,i+lf);
			str=sb.toString();
		}
		System.out.println("String after Delete :"+str);
	}	
}

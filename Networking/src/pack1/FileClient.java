package pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class FileClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		String str,fname;
		Socket soc=new Socket("localhost",95);
		PrintWriter pout=new PrintWriter(soc.getOutputStream(),true);
		BufferedReader br=new BufferedReader(new InputStreamReader(soc.getInputStream()));
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));;
		while(true)
		{
			System.out.println("Enter File name :");
			fname=br1.readLine();
			pout.print(fname);
			while(true)
			{
				str=br.readLine();
				if(str.equals("end"))
					break;
				System.out.println(str);
			}
			pout.println("end");
			break;
		}
	}

}

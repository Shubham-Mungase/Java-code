package pack1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
	public static void main(String[] args) {
		String str="",fname,str1="";
		PrintWriter pout=null;
		try {
			ServerSocket ss=new ServerSocket(95);
			Socket soc=ss.accept();
			pout=new PrintWriter(soc.getOutputStream(),true);
			BufferedReader br=new BufferedReader(new InputStreamReader(soc.getInputStream()))
;
			while(true)
			{
				fname=br.readLine();
				BufferedReader brfile=new BufferedReader(new FileReader(fname));
				if(brfile==null)
				{
					System.out.println("file not present");
				}
				else
				{
					do {
						str=brfile.readLine();
						if(str==null)
						{
							break;
						}
						pout.println(str);
						
					}while(true);
					pout.println("end");
					break;
				}
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}

package pack1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class DataServerSoc {
	public static void main(String[] args) throws IOException {
		
		String str;
		ServerSocket ss=new ServerSocket(95);
		Socket soc=ss.accept();
		
		System.out.println("Client Connected"+soc);
		InputStream in=soc.getInputStream();
		Scanner sc=new Scanner(in);
		do
		{
			str=sc.nextLine();
			if(str.equalsIgnoreCase("stop"))
				break;
			System.out.println(str);
		}while(true);
	}

}

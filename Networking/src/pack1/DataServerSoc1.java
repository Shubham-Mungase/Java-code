package pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class DataServerSoc1 {
	public static void main(String[] args) throws IOException {
		String str;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		InetAddress ip=InetAddress.getByName("DESKTOP-IADCANG");
		Socket soc=new Socket(ip,95);
		OutputStream out=soc.getOutputStream();
		PrintWriter pout=new PrintWriter(out,true);
		System.out.println("Enter msg and type stop at end");
		do {
			str=br.readLine();
			pout.println(str);
			if(str.equalsIgnoreCase("stop"))
			{
				break;
			}
			System.out.println(str);
		}while(true);
	}

}

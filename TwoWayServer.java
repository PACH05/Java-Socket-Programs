import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TwoWayServer{
	public static void main(String[] args) throws Exception{
			ServerSocket ss = new ServerSocket(3000);
			Socket s = ss.accept();
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			Scanner sc = new Scanner(System.in);
			String str ="", str2 = "";

			while(!str.equals("stop")){
				str = din.readUTF();
				System.out.println("Client Says : "+ str);
				str2 = sc.nextLine();
				dout.writeUTF(str2);
				dout.flush();
			}
			din.close();
			ss.close();
			s.close();
			dout.close();
	}
}

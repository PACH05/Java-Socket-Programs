import java.io.*;
import java.net.*;
import java.util.Scanner;
public class TwoWayClient{
	public static void main(String[] args) throws Exception{
			Socket s = new Socket("localhost", 3000);
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			Scanner sc = new Scanner(System.in);
			String str ="", str2 = "";

			while(!str2.equals("stop")){
				str2 = sc.nextLine();
				dout.writeUTF(str2);
				str = din.readUTF();
				System.out.println("Server Says : "+ str);
				dout.flush();
			}
			din.close();
			s.close();
			dout.close();
	}
}


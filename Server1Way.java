import java.io.*;
import java.net.*;

public class Server1Way{
	public static void main(String[] args) {
		try{
			ServerSocket ss = new ServerSocket(3000);
			Socket s = ss.accept();

			DataInputStream din = new DataInputStream(s.getInputStream());
			String str = (String)din.readUTF();
			System.out.println(str);
			din.close();
			s.close();
			ss.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
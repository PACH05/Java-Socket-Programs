import java.io.*;
import java.net.*;

public class Client1Way{
	public static void main(String[] args) {
		try{
			Socket s = new Socket("localhost",  3000);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello");
			dout.flush();
			dout.close();
			s.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}


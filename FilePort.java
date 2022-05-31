import java.net.*;

public class FilePort{
	public static void main(String[] args) {
		try{
			URL url = new URL(" ");
	        System.out.println("Protocol : "+ url.getProtocol());	
			System.out.println("Host : "+ url.getHost());	
			System.out.println("Port Number : "+ url.getPort());
			System.out.println("Default Port : "+ url.getDefaultPort());
			System.out.println("File : "+ url.getFile());
			System.out.println("Query : "+ url.getQuery());
		}catch(Exception e){
	      e.printStackTrace();      
	    }
   }
}
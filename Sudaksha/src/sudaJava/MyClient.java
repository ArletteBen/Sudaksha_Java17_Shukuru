package sudaJava;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MyClient {

	public static void main(String[] args) {
		System.out.println("client running...");
		try {
			Socket s=new Socket("localhost",6666);
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello Server");
			dout.flush();
			dout.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

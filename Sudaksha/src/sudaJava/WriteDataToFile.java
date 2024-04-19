package sudaJava;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataToFile {

	public static void main(String[] args) {
	try {
		FileOutputStream fos=new FileOutputStream("C:\\Users\\shu2207083104\\Desktop\\java17IO\\sample.txt");
		for(int i=65; i<=90;i++) {
			fos.write(i);
		}
		System.out.println("created");
		fos.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

}

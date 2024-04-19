package sudaJava;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataFromFile {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\shu2207083104\\Desktop\\java17IO\\sample.txt");
			int c=0;
			while((c=fis.read())!=-1) {
			System.out.println((char)c);	
			}
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

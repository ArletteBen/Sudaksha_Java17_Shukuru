package sudaJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteExercise {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\shu2207083104\\Desktop\\java17IO\\sample.txt");
			FileOutputStream fos=new FileOutputStream("C:\\Users\\shu2207083104\\Desktop\\java17IO\\sample2.txt");
			int c=0;
			while((c=fis.read())!=-1) {
			System.out.println((char)c);
			fos.write((char)c);
			}
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

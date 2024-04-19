package sudaJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
	public static void main(String[] args) {
		try (FileInputStream fis=new FileInputStream("C:\\Users\\shu2207083104\\Desktop\\java17IO\\sample3");
				ObjectInputStream ois=new ObjectInputStream(fis);)
		{
			Object obj;
			while((obj=ois.readObject())!=null) {
				CardInfo card=(CardInfo) obj;
				System.out.println(card);
			}
		} catch (IOException | ClassNotFoundException e) {
		}
	}
}

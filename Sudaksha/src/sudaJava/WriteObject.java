package sudaJava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
	public static void main(String[] args) {
		try(FileOutputStream fos =new FileOutputStream("C:\\Users\\shu2207083104\\Desktop\\java17IO\\sample3");
				ObjectOutputStream oos=new ObjectOutputStream(fos);) {
		CardInfo card1= new CardInfo(11,12,13,5,"suda");
		CardInfo card2= new CardInfo(12,13,14,45,"sudak");
		oos.writeObject(card1);
		oos.writeObject(card2);
		System.out.println("created");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

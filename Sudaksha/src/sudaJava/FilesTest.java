package sudaJava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesTest {

	public static void main(String[] args) {
	Path path=Path.of("C:\\Users\\shu2207083104\\Desktop\\java17IO\\textfile.txt");
    String sample="this is a sample nio file in java 11";
    
    try {
    	Files.writeString(path, sample);
    	String read=Files.readString(path);
    	System.out.println(read);
    }catch(IOException e) {
    	e.printStackTrace();
    }
    System.out.println("created");
	}

}

package sudaJava;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileCreation {

	public static void main(String[] args) {
		final int BUFFER=1024;
		//declare a file to be zipped
		File file=new File("C:\\Users\\shu2207083104\\Desktop\\java17IO\\sample.txt");
		try(FileInputStream fis=new FileInputStream(file);
			BufferedInputStream bis=new BufferedInputStream(fis,BUFFER);
			FileOutputStream fos=new FileOutputStream("C:\\Users\\shu2207083104\\Desktop\\java17IO\\sample.zip");
			ZipOutputStream zos=new ZipOutputStream(fos);
				) {
		//File name created using the source file
			ZipEntry entry=new ZipEntry(file.getName());
			zos.putNextEntry(entry);
			byte data[]=new byte[BUFFER];
			int count;
			while((count=bis.read(data,0,BUFFER))!=-1)
				zos.write(data,0,count);
			System.out.println("created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

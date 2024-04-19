package com.sudaska.account.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.sudaska.account.beans.Account;

public class AccountDao {
	
public void write(List<Account> account) {
	try(FileOutputStream fos =new FileOutputStream("C:\\Users\\shu2207083104\\Desktop\\java17IO\\accountDet");
	ObjectOutputStream oos=new ObjectOutputStream(fos);) {
			oos.writeObject(account);
	System.out.println("created");
	} catch (IOException e) {
		e.printStackTrace();
	}
}
public List<Account> read() {
	List<Account> accList=new ArrayList<Account>();
	try (FileInputStream fis=new FileInputStream("C:\\Users\\shu2207083104\\Desktop\\java17IO\\accountDet");
		ObjectInputStream ois=new ObjectInputStream(fis);
	)
	{
		Object obj;
		while((obj=ois.readObject())!=null) {
			 accList=(List<Account>) obj;
		}
	} catch (IOException | ClassNotFoundException e) {
	}
	return accList;
}
}

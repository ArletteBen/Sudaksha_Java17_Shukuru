package com.sudaska.account.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


import com.sudaska.account.beans.Transaction;

public class TransactionDao {
	public void write(List<Transaction> transaction) {
		try(FileOutputStream fos =new FileOutputStream("C:\\Users\\shu2207083104\\Desktop\\java17IO\\transDet");
		ObjectOutputStream oos=new ObjectOutputStream(fos);) {
				oos.writeObject(transaction);
		System.out.println("transaction created");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public List<Transaction> read() {
		List<Transaction> transList=new ArrayList<Transaction>();
		try (FileInputStream fis=new FileInputStream("C:\\Users\\shu2207083104\\Desktop\\java17IO\\transDet");
			ObjectInputStream ois=new ObjectInputStream(fis);
		)
		{
			Object obj;
			while((obj=ois.readObject())!=null) {
				transList=(List<Transaction>) obj;
				
			}
		} catch (IOException | ClassNotFoundException e) {
		}
		//System.out.println("transList"+transList);
		return transList;
	}
}

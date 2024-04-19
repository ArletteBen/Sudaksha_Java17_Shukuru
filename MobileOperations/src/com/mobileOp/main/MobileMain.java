package com.mobileOp.main;

import java.util.Scanner;

import com.mobileOp.dao.MobileOperations;

public class MobileMain {

	public static void main(String[] args) {
		int choice=0;
		Scanner sc=new Scanner(System.in);
		String brand;
		String model;
		MobileOperations mo=new MobileOperations();
		while(choice!=4) {
		System.out.println("1.add mobile");
		System.out.println("2.get mobile");
		System.out.println("3.buy mobile");
		System.out.println("4.exit");
		choice=sc.nextInt();
		switch(choice){
		case 1->{
			sc=new Scanner(System.in);
			System.out.println("enter the brand name");
			brand=sc.nextLine();
			System.out.println("enter the model");
			model=sc.nextLine();
			mo.addMobile(brand, model);
		}
		case 2->{
			sc=new Scanner(System.in);
			System.out.println("enter the brand name");
			brand=sc.nextLine();
			mo.getMobile(brand);
		}
		case 3->{
			sc=new Scanner(System.in);
			System.out.println("enter the brand name");
			brand=sc.nextLine();
			System.out.println("enter the model");
			model=sc.nextLine();
			mo.buyMobile(brand, model);
		}
		}
		}
	}

}

package sudaJava;

import java.util.Scanner;

public class StringExamples {
	public static void main(String[] args) {
	/*Scanner sc=new Scanner(System.in);
	*/
		System.out.println("please enter a string");
	Scanner sc2=new Scanner(System.in);
	StringBuilder sb=new StringBuilder(sc2.nextLine());
	
	if(sb.equals(sb.reverse().toString())) {
		System.out.println("it is a palindrome ");	
	}else {
		System.out.println("it is not a palindrome ");
	}
	System.out.println("please enter a string");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	for(int i=0; i<str.length(); i++) {
		System.out.println("subsets "+str.substring(i));		
	}
	for(int i=0; i<str.length(); i++) {
		System.out.println("every char of a string "+str.charAt(i));		
	}
	for(int i=0; i<str.length(); i++) {
		System.out.println("every char of a string "+str.charAt(i));		
	}
	/*for(int i=0; i<str.length(); i++) {
		System.out.println("every char of a string "+str.charAt(i));		
	}*/
	}
}

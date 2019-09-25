package com.durgasoft.strings;

import java.util.Scanner;

public class p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your city name:");
		//String name=sc.nextLine();
		
		String name=sc.nextLine().toLowerCase().trim();
		if(name.equals("hyderabad")) {
			System.out.println("hello Hyderabadi,Aadaab..");
		}else if(name.equals("chennai")) {
			System.out.println("Hello Madrasi,Vanakkam..");
		}else if(name.equals("banglore")) {
			System.out.println("Hello Kannadinga, Namaskara..");
		}else {
			System.out.println("please enter a valid city name");
		}
		
		sc.close();
		
		String s="DURGA SOFT";
		System.out.println(s.length()); //10
		System.out.println(s.trim().length());//10
		
	//trim method doesn't remove  blank spaces present in between String.
	//trim() method can be used only to remove spaces present at beginning and end of the String
	}

}


/*Enter your city name:
	  Hyderabad  
hello Hyderabadi,Aadaab..*/
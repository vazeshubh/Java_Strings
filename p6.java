package com.durgasoft.strings;

public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1=new String("you cannot change me");
		String s2=new String("you cannot change me");
		System.out.println(s1==s2);//false
		
		String s3="you cannot change me";
		System.out.println(s1==s3);//false
		
		String s4="you cannot change me";
		System.out.println(s3==s4);//true
		
		String s5="you cannot "+"change me";
		System.out.println(s4==s5);//true
		
		String s6="you cannot ";
		String s7=s6+"change me";
		System.out.println(s4==s7);//true
		
		final String s8="you cannot ";
		String s9=s8+"change me";
		System.out.println(s4==s9);//??
		
	}

}

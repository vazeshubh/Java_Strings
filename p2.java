package com.durgasoft.strings;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1=new String("durga");
		String s2=new String("durga");
		System.out.println(s1==s2);//false
		System.out.println(s1.equals (s2));//true
		
		
		StringBuffer sb1=new StringBuffer("durga");
		StringBuffer sb2=new StringBuffer("durga");
		System.out.println(sb1==sb2);//false
		System.out.println(sb1.equals (sb2));//false
		
	}

}

package com.durgasoft.strings;

public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1=new String("spring");
		s1.concat("Fall");
		
		String s2=s1.concat("Winter");
		s2.concat("Summer");
		
		System.out.println(s1);//spring
		System.out.println(s2);//springWinter
	}

}

package com.durgasoft.strings;

public class p1 {
	public static void main(String[] args) {
		
		String s=new String("Durga");
		s.concat("Software");
		System.out.println(s);//Durga
		
		StringBuffer sb=new StringBuffer("Durga");
		sb.append("Software");
		System.out.println(sb);//DurgaSoftware

	}

}

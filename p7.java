package com.durgasoft.strings;

//This program shows various methods available in String class

public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1)charAt()
		String s="durga";
		System.out.println(s.charAt(0));//d
		//System.out.println(s.charAt(30)); //RE:String index out of range: 30
		
		//2)concat()
		String s1="durga";
		s1=s1.concat("Software"); //durgaSoftware
		//s1=s1+"Software"; //durgaSoftware
		//s1+="Software";//durgaSoftware
		System.out.println(s1);//
		
		//3)equals(Object o) & 4)equalsIgnoreCase(Stringg s)
		String s2="DURGA";
		//equals method is used in cases such as password
		System.out.println(s2.equals("durga"));//false
		//equalsIgnoreCase method is used in cases such as username
		System.out.println(s2.equalsIgnoreCase("durga"));//true
		
		//5)isEmpty()
		String s3="";
		System.out.println(s3.isEmpty());//true
		String s4="shubhada";
		System.out.println(s4.isEmpty());//false
		
		//6)length()
		System.out.println(s4.length());//8
		
		//7)replace()
		String s5="ababab";
		System.out.println(s5.replace('a','b'));//bbbbbb
		
		//8)substring(int begin)
		String s6="abcdefg";
		System.out.println(s6.substring(3));//defg
		//9)substring(int begin,int end)
		System.out.println(s6.substring(3, 6));//def
		
		String s7="shubhada";
		System.out.println(s7.indexOf('b'));//3
		System.out.println(s7.indexOf('z'));//-1
		System.out.println(s7.indexOf('a'));//5-->returns index of first occurance
		
		System.out.println(s7.lastIndexOf('a'));//7
		
		System.out.println(s7.toLowerCase());//shubhada
		System.out.println(s7.toUpperCase());//SHUBHADA
		
	}

}

package com.stringreverse;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//finding reverse of string with normal ways
		String s="excel";
		char[] c=s.toCharArray();
		int len=(c.length-1);
		System.out.println("Lenght : "+len);
		
		for(int i=len;i>=0;i--)
			System.out.print(c[i]);*/
		
		//using stringBuilder
		String str="excel";
		
		StringBuilder strb=new StringBuilder();
		strb.append(str);
		System.out.println("Converting to Builder : "+strb);
		
		strb.reverse();
		System.out.println("Reversing the string : "+strb);
		
		System.out.println("strb length : "+strb.length());
		for(int i=0;i<strb.length();i++)
			System.out.print(strb.charAt(i));
		

	}

}

package com.reverse;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="shankar";
		char a[]=s.toCharArray();
		//System.out.println(a);
		
		int length=a.length;
		System.out.println("Length : "+length);
		
		int len=a.length;
		len=(len-1);
		for(int i=len;i>=0;i--)
		{
			
			System.out.print(a[i]);
		}
		
		
	}

}

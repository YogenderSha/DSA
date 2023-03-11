package com.dsa.Strings;

public class Q033_String_MulString {

	public static void main(String[] args) {
//		String s = "123";
//		int i=s.length()-1,count=0,j=0; 
//		while(i>=0) {
//		int a=(int) (Math.pow(10, j)*(s.charAt(i)-'0'));
//		count+=a;
//		i--;  
//		j++;  
//		}
//		System.out.println(count);
		//https://leetcode.com/problems/multiply-strings/
		System.out.println(product("123456789","987654321"));
		

	}
    public static String product(String num1,String num2) {
    	
    	
    	int i=num1.length()-1,j=0; 
    	long count1=0;
		while(i>=0) {
		long a=(long) (Math.pow(10, j)*(num1.charAt(i)-'0'));
		count1+=a;
		i--;  
		j++;  
		}
		
     	int b=num2.length()-1,y=0; 
		long count2=0;
		while(b>=0) {
		long a=(long) (Math.pow(10, y)*(num2.charAt(b)-'0'));
		count2+=a;
		b--;  
		y++;  
		}
		
		long ans= (long) count1 * count2;
		return String.valueOf(ans);
    	
	}

}

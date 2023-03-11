package com.dsa.Strings;

public class Q025_Strings_Reversal {

	public static void main(String[] args) {
		String s="yogi";
		
		System.out.println(ReverseString(s));

	}
	
	public static char[] ReverseString(String s) {
		 for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); //extracts each character
	        nstr= ch+nstr; //adds each character in front of the existing string
	      }
	      System.out.println("Reversed word: "+ nstr);
	}
	
	static void swap(char[] ch , int i, int j)
    {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

}

package com.dsa.Strings;

public class Q061_Strings_modifyString {

	public static void main(String[] args) {
		//1576. Replace All ?'s to Avoid Consecutive Repeating Characters
		System.out.println(modifyString("??yw?ipkj?"));

	}
	public static String modifyString(String s) {
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='?') {
				for(char c='a';c<='z';c++) {
					ch[i]=c;
					if(i>0 && ch[i-1]==c) continue;
					if(i<ch.length-1 && ch[i+1]==c) continue;
					break;
				}
			}
		}
		return new String(ch);
	      
    }

}

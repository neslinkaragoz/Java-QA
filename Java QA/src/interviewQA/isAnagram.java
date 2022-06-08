package interviewQA;

import java.util.Arrays;

public class isAnagram {

	public static void main(String[] args) {
		
		
		//Write a method if word you pass is Anagram 
		System.out.println(isAnagram2("dear","read"));
		
	}

	public static boolean isAnagram2(String str1, String str2) {
		char [] ch1 = str1.toCharArray();
		Arrays.sort(ch1);
		char [] ch2 = str2.toCharArray();
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
		
	}

}

package interviewQA;

import java.util.Arrays;

public class StringToArrayToString {

	public static void main(String[] args) {
	
		
		//CONVERT STRING TO ARRAY 
		String str = "YollAcademy";
		char [] array = str.toCharArray();
		System.out.println(array.length);
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}

		//CONVERT ARRAY TO STRING 
		System.out.println(String.valueOf(array));
		
		System.out.println(Arrays.toString(array));

	}

}

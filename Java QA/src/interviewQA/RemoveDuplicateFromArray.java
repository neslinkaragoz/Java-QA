package interviewQA;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
	
	public static void main (String [] args) {
	
		//REMOVE DUPLICATE FROM ARRAY 
	int a []= {1,4,3,4,6,10,6};
	Arrays.sort(a);
	int result [] =new int [a.length];
	int k = 0;
	for(int i=0; i<a.length-1; i++) {
		if(a[i] != a[i+1]) {
			result [k++] = a[i];
		}
	}
	result [k++] = a[a.length-1];
	for (int i =0; i<k; i++) {
		System.out.print(" " +result[i]);
	}
	}
}

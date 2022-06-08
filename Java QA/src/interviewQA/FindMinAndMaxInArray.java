package interviewQA;

import java.util.Arrays;
import java.util.Collections;

public class FindMinAndMaxInArray {
	
	public static void main(String [] args) {
		
		//FIND MINIMUM AND MAXIMUM IN ARRAY 
		//1st Way
		int [] array = {5,7,11,15,320,0,-96,123,-5,-500};
		int minimum = 0;
		int maximum = 0;
		for (int i=0;i<array.length; i++) {
			if(array[i] > maximum) {
				maximum=array[i];
			}else if(array[i] <minimum) {
				minimum = array[i];
			}
		} 
		System.out.println("minimum: " + minimum);
		System.out.println("maximum: " + maximum);
		
		
		//FIND MINIMUM AND MAXIMUM IN ARRAY //2nd Way
		Integer[] arr = {7,0,25,-1,5,40};
		int min = Collections.min(Arrays.asList(arr));
		int max = Collections.max(Arrays.asList(arr));
		System.out.println("Minimum: "+min);
		System.out.println("Maximum: "+max);
	}

}

package interviewQA;

import java.util.Arrays;

public class SortArrWithoutSortMethod {

	public static void main(String[] args) {
		
		//SORT AN ARRAY WITHOUT USING SORT METHOD
		int arr [] = {5, 4, 3, 8, 32, 768, 564, 95, 172, 1500, 859, 754 };
		for (int i = 0; i<arr.length; i++) {
			//Loop over java Array outer loop use 
			for (int j=i+1; j<arr.length; j++) {
				int temp = 0; // temporary variable in order to compare 
				if(arr[i] >arr[j]) {
					//compare outer loop object with inner loop 
					temp = arr[i]; // if greater than swapping 
					arr[i] = arr[j];  //swapping code here 
					arr[j] = temp;
				}
			}
		}
		//After Sorting Printing the Value
		for (int i =0; i <arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		
		
		System.out.println(" ");
		
		//SORT ARRAY WITH SORT METHOD 
		int arr2 [] = {5, 4, 3, 8, 32, 768, 564, 95, 172, 1500, 859, 754 };
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
	}

}

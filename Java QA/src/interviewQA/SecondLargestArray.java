package interviewQA;

public class SecondLargestArray {

	public static void main(String[] args) {
		
		//FIND THE SECOND LARGEST IN ARRAY 
		int arr [] = {25,20,24,12,5};
		int largest = arr [0];
		int secondLargest =arr [0];
		for (int i=0; i<arr.length; i++) {
			if(arr[i] >largest) {
				secondLargest=largest;
				largest = arr [i];
			} else if (arr[i] > secondLargest) {
				secondLargest =arr[i];
			}
		}
			System.out.println("the second largest number is :" +secondLargest);
			
		
	}

}

package interviewQA;

public class FindDuplicateOf2Arrays {

	public static void main(String[] args) {
	
		
		//FIND DUPLICATE OF TWO INT ARRAYS
		int [] num1 = {3,4,6,7,9,2};
		int [] num2 = {7,4,3,20};
		
		for (int i =0; i<num1.length; i++) {
			for (int j=0; j<num2.length; j++) {
				if (num1[i]==num2[j]) {
					System.out.println(num1[i]);
				}
			}
		}
		
		// FIND DUPLICATE OF TWO STRING ARRAYS 
		String [] names = {"neslin", "travel", "love"};
		String [] names2 = {"travel", "love", "enjoy","honey"};
		
		for (int i=0; i<names.length; i++) {
			for (int j = 0; j<names2.length; j++) {
				if (names[i].equals(names2[j])) {
					System.out.println(names[i]);
				}
			}
		}
			
		
	}

}

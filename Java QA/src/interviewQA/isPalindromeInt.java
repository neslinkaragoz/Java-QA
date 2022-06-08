package interviewQA;

public class isPalindromeInt {

	public static void main(String[] args) {

		       // CHECK IF NUMBER PALINDROME OR NOT 
		
//				Scanner sc = new Scanner(System.in);
//				
//				System.out.println("Enter a number");
			
	int num = 345543;
	int original = num;
	int reverse = 0;
				
	while (num!= 0) {
	reverse = reverse*10 + num%10;
	num = num/10;
	}
	if(original == reverse) {
		System.out.println(original + " is palindrome number");
			} else {
			System.out.println(original + " not palindrome number");
			}
		
		
	}

}

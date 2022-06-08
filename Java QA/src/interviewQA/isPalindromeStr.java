package interviewQA;

public class isPalindromeStr {

	public static void main(String[] args) {
		
		//IS STRING PALINDROME?
	String str = "madam";
	String reverse ="";
	for (int i =str.length()-1; i>=0; i--) {
		reverse += str.charAt(i);
	} 
	boolean palindrome = true;
	for(int i =0; i< str.length(); i++) {
		if (str.charAt(i) != reverse.charAt(i)) {
			palindrome = false;
		}
	}
		if(palindrome) {
			System.out.println("PALINDROME");
		} else {
			System.out.println("not palindrome");
		}
		
		
		
		// IS SENTENCE PALINDROME
	String original = "nurses run";
	original = original.replace(" ", "");
	String reversed = "";
	for (int i =str.length()-1; i>=0; i--) {
		reversed += original.charAt(i);
	} 
	boolean isPalindrome = true;
	for(int i =0; i< str.length(); i++) {
		if (str.charAt(i) != reverse.charAt(i)) {
			isPalindrome = false;
		}
	}
		if(isPalindrome) {
			System.out.println("PALINDROME");
		} else {
			System.out.println("not palindrome");
		}
	
	
}
}
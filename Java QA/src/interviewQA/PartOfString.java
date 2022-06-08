package interviewQA;

public class PartOfString {

	public static void main(String[] args) {

		//HOW TO GET A PART OF THE STRING FROM A STRING? 
		//			  01234567890123456
		String str = "Let's Rock & Roll";
		System.out.println(str.substring(13)); //Roll
		
		String [] words = str.split(" ");
		System.out.println(words.length);
		for (String str2 :words) {
			System.out.println(str2);
		}
		
		
	}

}

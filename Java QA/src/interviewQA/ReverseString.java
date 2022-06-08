package interviewQA;

public class ReverseString {

	public static void main(String[] args) {
		
		
		//REVERSE A STRING 
		// 1st Way 
		String str = "Hello World";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		//2nd Way 
				String name = "Neslin"; 
				String reverse= "";
				for (int i=name.length()-1; i>=0; i--) {
					reverse = reverse + name.charAt(i);
				} 
				System.out.println(reverse);
					
		//3rd Way
				String name1 = "Java Reverse";
				String reverse1 = "";
				for (int i =name1.length(); i>=1; i--) {
					reverse1 = reverse1 + name1.substring(i-1,i); 
				}
				System.out.println(reverse1);
				
	
	}

}

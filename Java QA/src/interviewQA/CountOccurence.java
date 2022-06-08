package interviewQA;

public class CountOccurence {

	public static void main(String[] args) {

		String a = "java";	
		int count = 0;
		char[] word = a.toCharArray();
		String str = "";
				
		for(int i=0 ; i<word.length ; i++) {
			count = 1;
			for(int j=i+1 ; j<word.length-1 ; j++) {
				if(word[i]==word[j]) {
					count++;
					word[j]=' ';
				}	
			}
			if(word[i] != ' ') {
				str += count + "" + word[i];
			}
		}
		 System.out.println(str);

		
	}

}

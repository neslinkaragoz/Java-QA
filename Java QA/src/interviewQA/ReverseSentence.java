package interviewQA;

public class ReverseSentence {

	public static void main(String[] args) {
	
		//REVERSE SENTENCE 
		
		String sentence = "neslin loves java";
		
		String [] sentenceSplit = sentence.split(" ");
		
		for (int i = sentenceSplit.length-1; i>=0; i--) {
			System.out.print(sentenceSplit[i] + " ");
		}
		
		
		//Write a method to reverse String 
		//REVERSE STRING WITH METHOD 
		System.out.println(isReversed("hel hello"));
		
	}
	//METHOD OF REVERSING STRING 
	public static String isReversed(String str) {
		String result = "";
		String [] strArray = str.split(" ");
		for (int i=strArray.length-1; i>=0; i--) {
			result += strArray[i] + " ";
		}
		 return result;	
	}
}

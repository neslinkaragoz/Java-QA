package interviewQA;

public class RemoveJunk {

	public static void main(String[] args) {

		String s = "%^&@# hello 12342";
		
		//Regular Expression: [a-zA-Z0-9]
		//
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		
		
		
		
	
		
		
		String str="Pr!ogr#a@#@#@@3-0320240=03ag(e";
		String resultStr ="";
		
		for (int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)>64 && str.charAt(i)<=122) {
				resultStr=resultStr+str.charAt(i);
			}
		}
		System.out.println("removed: " + resultStr);
		
	}

}

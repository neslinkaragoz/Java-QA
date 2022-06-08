package interviewQA;

public class Swap {

	public static void main(String[] args) {
		
		//SWAP TWO VARIABLE VALUES WITHOUT USING TEMPORARY VARIABLE 
		int a = 5;
		int b = 3;
		System.out.println("Before Swapping \na is :"+ a + " b is :"+b);
		
		a = a+b; //8
		b = a-b; //5
		a = a-b; //3
		System.out.println("After Swapping \na is :"+ a + " b is :"+b);
		
		
		//SWAP STRING 
		String str1 = "Neslin";
		String str2 = "Karagoz";
		str1 = str1 + str2;
		str2 = str1.substring(0,(str1.length()-str2.length()));
		str1 = str1.substring(str2.length());
		System.out.println(str1);
		System.out.println(str2);
		
		
		//SWAPS 
				String name1 ="WORLD";
				String name2 ="HELLO";
				name1= name1+name2; //neslinaylin
				name2 = name1.substring(0, name1.length()-name2.length());
				name1 =name1.substring(name2.length());
				System.out.println(name1);
				System.out.println(name2);
		
	}

}

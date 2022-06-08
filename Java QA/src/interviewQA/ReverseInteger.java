package interviewQA;

public class ReverseInteger {

	public static void main(String[] args) {
		
		
		//REVERSE AN INTEGER 
		
		//1st Way 
		int num = 364;
		String numbers = String.valueOf(num);
		StringBuffer sb = new StringBuffer(numbers);
		System.out.println(sb.reverse()); 
		
		//2nd Way
		int num1 = 4788593;
		String convert =String.valueOf(num1);
		char[] arrayChar = convert.toCharArray();
		int size = arrayChar.length;
		for (int i = size-1; i>=0; i--) {
			System.out.print(arrayChar[i]);
		}
		
		//3rd Way 
		int currentNum =123456;
		int reversedNum=0;
		while (currentNum!=0) {
			reversedNum=reversedNum*10 + currentNum%10;
			currentNum=currentNum/10; 
		}
		System.out.println(reversedNum);

	}

}

package interviewQA;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDupFrmArrayList {

	public static void main(String[] args) {
		
		//REMOVE DUPLICATES FROM ARRAYLIST 
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("neslin");
		arrList.add("aylin");
		arrList.add("neslin");
		arrList.add("berrin");
		arrList.add("yasemin");
		arrList.add("aylin");
		
		//1ST WAY
		HashSet<String> set = new HashSet<String>(arrList);
		System.out.println(set);
		
		//2ND WAY
		HashSet<Object> hSet = new HashSet<Object>();
		for (Object name : arrList) {
			hSet.add(name); 
		} System.out.println(hSet);
	}

}

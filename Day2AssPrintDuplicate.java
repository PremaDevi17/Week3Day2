package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day2AssPrintDuplicate {
	public static void main(String[] args) {
		List<Integer> List = new ArrayList<Integer>();
		Collections.addAll(List,14,12,13,11,15,14,18,16,17,19,18,17,20);
		for (int i=0;i<List.size();i++) {
			for (int j=i+1;j<List.size()-1;j++) {
				if (List.get(i) == List.get(j)) {
						System.out.println(List.get(j));
				        List.remove(j);
				}	
				
			}
				
		}
	}
}

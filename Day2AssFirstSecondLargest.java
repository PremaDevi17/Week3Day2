package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day2AssFirstSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> List = new ArrayList<Integer>();
		Collections.addAll(List,3,2,11,4,6,7);
		Collections.sort(List);
		System.out.println("Second Largest Number is: "+ List.get(4));
	}

}

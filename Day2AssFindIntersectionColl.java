package week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day2AssFindIntersectionColl {
public static void main(String[] args) {
	Integer arr1[] = {3,2,11,4,6,7};
	Integer arr2[] = {1,2,8,4,9,7};
	
	Set<Integer> set = new HashSet<Integer>();
	set.addAll(Arrays.asList(arr1));
	set.retainAll(Arrays.asList(arr2));
	System.out.println(set);
}
}

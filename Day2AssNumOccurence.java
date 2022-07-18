package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Day2AssNumOccurence {
	public static void main(String[] args) {

		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		int[] a = {2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1};
		for(int i = 0;i<a.length;i++) {
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
		}
		System.out.println(map);
	}
}

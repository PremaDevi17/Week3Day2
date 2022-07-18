package week3.day2;

import java.util.LinkedHashSet;

public class Day2AssRemoveDuplicatesColl {
public static void main(String[] args) {
	String text = "We learn java basics as part of java sessions in java week1";
	String[] words = text.split(" ");
	LinkedHashSet<String> set = new LinkedHashSet<String>();
	for (int i=0;i<words.length;i++) {
	set.add(words[i]);
	}  
	System.out.println(set);
for (String eachName : set) {
	System.out.println(eachName+" ");
}

		
}
}

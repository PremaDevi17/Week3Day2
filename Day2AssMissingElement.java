package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day2AssMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list,1,2,3,4,7,6,8);
		Collections.sort(list);
				
		for (int i=1;i<=list.size();i++) {
			if (list.get(i-1)==i) {
				continue;
			}
				else {
					System.out.println("missing Number is: "+ i);
					break;
				}				
				
			}
			
		}
	}


package com.ajay.HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class GradingStudents {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(73);
		list.add(67);
		list.add(38);
		list.add(33);
		List<Integer> gradingStudent = gradingStudent(list);
		//System.out.println(gradingStudent);
		
		Function<Integer, Integer> f1 = i -> i*i;
		System.out.println(f1.apply(5));
		int a =5,b=5;
		add(a,b);
		//System.out.println(Math.round(Math.sqrt(12)));
		
	}

	private static void add(int a, int b) {
		(a,b) -> System.out.println(a+b);		
	}

	private static List<Integer> gradingStudent(List<Integer> lst) {
		List<Integer> res = new ArrayList();
		int cal;
		int i = 1;
		for (int j = 0; j < lst.size(); j++) {
			
			while (true) {
				cal = 5 * i;
				if (cal > lst.get(j)) {
					break;
				}
				i++;
			}
		
			if(cal  < 38 ) {
				res.add(lst.get(j));
			}
			else if ((cal - lst.get(j)) < 3) {
				res.add(cal);
				
			}
			else {
				res.add(lst.get(j));
				
			}
			i = 1;
		}
		return res;
	}
}

package com.tech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class hl {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(3);
		list2.add(4);
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(5);
		list3.add(6);

		List<List<Integer>> clist = Arrays.asList(list1, list2, list3);
		System.out.println(clist);
		List<Integer> flatlist = clist.stream().flatMap(k -> k.stream()).collect(Collectors.toList());
		
		System.out.println(flatlist);
		
		Optional<Integer> descint = flatlist.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst();
		
		System.out.println("3nd highest Number---"+descint.get());
		
		Optional<Integer> ascint =flatlist.stream().sorted((s1,s2) -> s1.intValue()-s2.intValue()).skip(1).findFirst();
		System.out.println("2nd Lowest Number--"+ascint.get());
		
		Optional<Integer> descendingint =flatlist.stream().sorted((s1,s2) -> s2.intValue()-s1.intValue()).skip(1).findFirst();
		System.out.println("2nd highest Number--"+descendingint.get());
		
	}
}

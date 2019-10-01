package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListReduceDemo {
	
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(1);
		lst.add(22);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		
		Stream s = lst.stream();
		int sum = lst.stream().reduce(0, (e1,e2) -> e1+e2);
		System.out.println(sum);
	}

}

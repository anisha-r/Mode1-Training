package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class LambdaLimit {
	
	public static void main(String[] args) {
		List<Integer> lstData = new ArrayList<Integer>();
		lstData.add(new Integer(42));
		lstData.add(new Integer(11));
		lstData.add(new Integer(18));
		lstData.add(new Integer(29));
		lstData.add(new Integer(32));
		
		lstData.stream().limit(3).forEach(p-> {
			System.out.println(p);
		});
		
		System.out.println("after skipping 2 records");
		lstData.stream().skip(2).forEach(p-> {
			System.out.println(p);
		});
		System.out.println("filter data");
		lstData.stream().filter(p->p>15).forEach(x-> {
			System.out.println(x);
		});
		
	}

}

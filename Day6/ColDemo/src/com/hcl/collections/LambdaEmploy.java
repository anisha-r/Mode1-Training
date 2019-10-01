package com.hcl.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaEmploy {
	public static void main(String[] args) {
		List<Employ> list = new ArrayList<Employ>();
		
		list.add(new Employ(6, "anisha", 173));
		list.add(new Employ(5, "giri", 143));
		list.add(new Employ(3, "ravi", 153));
		Collections.sort(list, (p1,p2)-> {
			return p1.name.compareTo(p2.name);
		});
	list.stream().filter(p->p.basic >= 150).forEach(x -> {
		System.out.println(x);
	});
	System.out.println("names start with g");
	list.stream().filter(p->p.name.startsWith("g")).forEach(x -> {
		System.out.println(x);
	});
}
}



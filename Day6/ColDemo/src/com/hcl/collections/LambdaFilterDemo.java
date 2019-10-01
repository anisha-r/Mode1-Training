package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class LambdaFilterDemo {
	
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "samsung", 17000));
		list.add(new Product(3, "iphone", 25000));
		list.add(new Product(6, "sony Xperia", 15000));
		list.add(new Product(5, "nokia", 26000));
		list.add(new Product(4, "lenevo", 19000));
		
		list.stream().filter(p->p.price >= 20000).forEach(x -> {
			System.out.println(x);
		});
		System.out.println("names start with s");
		list.stream().filter(p->p.name.startsWith("s")).forEach(x -> {
			System.out.println(x);
		});
		Product maxP=list.stream().max((p1,p2)->p1.price >=p2.price ?1:-1).get();
		System.out.println("max price record");
		System.out.println(maxP);
		Product minP=list.stream().min((p1,p2)->p1.price >=p2.price ?1:-1).get();
		System.out.println("min price record");
		System.out.println(minP);
		

	}

}

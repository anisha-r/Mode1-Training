package com.hcl.demo;

import java.util.function.BiFunction;

public class Calculator {
	
	public Integer calc(BiFunction<Integer,Integer,Integer> bi ,
			Integer a,Integer b){
		return bi.apply(a, b);
	}

}

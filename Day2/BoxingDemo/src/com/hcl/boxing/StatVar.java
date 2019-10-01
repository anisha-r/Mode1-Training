package com.hcl.boxing;

public class StatVar {
	
	static int score;
	public void incr(int x) {
		score+=x;
	}
	public static void main(String[] args) {
		StatVar fb=new StatVar();
		StatVar sb=new StatVar();
		StatVar ext=new StatVar();
		
		fb.incr(67);
		sb.incr(43);
		ext.incr(7);
		
		System.out.println(StatVar.score);
		
	}

}

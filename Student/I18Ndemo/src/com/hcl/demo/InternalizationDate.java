package com.hcl.demo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class InternalizationDate {
	
	public static void main(String[] args) {
		
	
	
	DateFormat df=DateFormat.getDateInstance(DateFormat.LONG,new Locale("fr","FR"));
	System.out.println("Long format  of date: " +df.format(new Date()));
	
	DateFormat df1=DateFormat.getDateInstance(DateFormat.SHORT,new Locale("de","DE"));
	System.out.println("Short format of date: " +df1.format(new Date()));
	
	DateFormat df2=DateFormat.getDateInstance(DateFormat.LONG,new Locale("ch","CH"));
	System.out.println("Medium format of date: "+df2.format(new Date()) );
	
	}
}

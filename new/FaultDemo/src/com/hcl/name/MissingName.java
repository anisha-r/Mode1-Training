package com.hcl.name;

public class MissingName extends Exception{
	public MissingName() {
		super("Your name is required.");
	}
}
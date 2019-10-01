package com.hcl.intf;

interface ITraining {
	void name();
	void email();
}

class Hema implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Hema..");
		
	}

	@Override
	public void email() {
		System.out.println("Email is Hema@gmail.com");
		
	}
	
}
class Keerthana implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Keerthana..");
		
	}

	@Override
	public void email() {
		System.out.println("Email is keerthana@gmail.com");
		
	}
	
}
public class IntfDemo {
	public static void main(String[] args) {
		ITraining[] arr=new ITraining[]
				{
						new Hema(),
						new Keerthana()
				};
		for (ITraining t : arr) {
			t.name();
			t.email();
			
		}
	}

}

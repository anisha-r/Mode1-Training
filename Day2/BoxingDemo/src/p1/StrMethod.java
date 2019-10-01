package p1;

public class StrMethod {
	

	static String S1 = "janani";
	static String S2 = "janani";

	
	static String name;
	public StrMethod(String name) {
		this.name=name;
	}
	public int length() {
		char[] arr=name.toCharArray();
		int i = 0;
		for (char c : arr) {
			i++;
		}
		return i;
	}
	public void eq() {
		if(S1==S2) {
			System.out.println("equal");
		
		} else {
			System.out.println("not equal");
		}
		
	}
	
//	public int upper() {
//		char[] arr=
//	}
	
	public static void main(String[] args) {
		StrMethod obj=new StrMethod("anisha");
		System.out.println(obj.length());
		System.out.println(S1.equals(S2));
	         String S4 = "java";
			 char ch=name.charAt(2);
			 System.out.println(ch);
			 String s2upper=S2.toUpperCase();  
			 System.out.println(s2upper);
			 String s2lower=S2.toLowerCase();  
			 System.out.println(s2lower);
			
			 
		 
		 
		  
		
	}
		
}  



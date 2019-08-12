package JavaConcepts;

public class StringMethods {

	public static void main(String[] args) {

		int a = 10;
		int b = 10;
		if (a == b)
			System.out.println("Equal values");
		
		//To compare two Strings
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1.equals(s2));
		
		//To convert into Lowercase
		String s3 = "LAPTOP";
		//String lc = s3.toLowerCase();
		System.out.println(s3.toLowerCase());
		
		//To get the Length of a String --- str.length();
		
		//To replace strings
		String s4 = "ManualAutomation HelloByeJava Manual";
		System.out.println(s4.replace("Manual", "Automation"));
		System.out.println(s4.replaceFirst("Manual", "Automation"));
		System.out.println(s4.replace(" ", ""));
		
		//To retrieve character at a particular index value
		String s5 = "JavaPractice";
		System.out.println("Character at index 10 is: "+s5.charAt(10));
		System.out.println("Index of P is: "+s5.indexOf('P'));
		
		//To remove extra spaces before & after a String
		String s6 = " Selenium   ";
		System.out.println(s6.trim());
		

	}

}

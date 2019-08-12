package JavaConcepts;

public class WrapperClass {

	public static void main(String[] args) {
     
		String x = "100";
		System.out.println(x+20);
		
		//Data conversion: String to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//String to Double Conversion
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to Boolean
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//Int to String
		int j = 200;
		System.out.println(j+200);
		String S = String.valueOf(j);
		System.out.println(S+200);
				
		//If Input is alpha-numeric
		String u = "100A";
		int w = Integer.parseInt(u);
		System.out.println(w);

	}

}

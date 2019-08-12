package JavaConcepts;

public  class FinalConcept {

	final int x = 5;
	
	public final void display()
	{
		int y = 10;
		System.out.println("Value of x is: "+y);
	}
	public static void main(String[] args) {
		
		FinalConcept fc = new FinalConcept();
				
		fc.display();


	}

}

package JavaConcepts;

public class Rectangle extends shape {
	
	@Override
	public void draw() {
      System.out.println("Child Class ---- Draw Method");
      sides = 5;
      area = 25;
      
	}

	public static void main (String[] args) {

		Rectangle rect = new Rectangle();
		rect.draw();
		
	
	}

	
		
	}



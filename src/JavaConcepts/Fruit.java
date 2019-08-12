package JavaConcepts;

public class Fruit {
	
	String name, color; //Global variables
	
	//Static variables - Doesn't needs an object to be called
	
	//DEFAULT CONSTRUCTOR
	public Fruit() //constructor for the class
	{
		name = "mango"; //initialising the values
		color = "Yellow";
	}
	
	public Fruit(String n, String c)
	{
		name = n;
		color = c;
	}
	public void display()
	{
		//String taste; //local variable
		System.out.println("Name: "+name);
		System.out.println("Color: "+color);
	}
			
	public static void main(String[] args) {
	
		Fruit f1 = new Fruit();
		f1.display();
		
		Fruit f2 = new Fruit("Grapes","Green");
		f2.display();

	}

}

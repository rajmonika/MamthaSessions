package JavaConcepts;

public class Orange extends Fruit1 {
	
	String color = "Yellow";
	
	public boolean add()
	{
		System.out.println("Child class add method");
		return false;
	}
	
	public void display()
	{
		System.out.println(super.color);
		System.out.println(super.add());
	}

	public static void main(String[] args) {

		Orange o = new Orange();
		o.display();

	}

}

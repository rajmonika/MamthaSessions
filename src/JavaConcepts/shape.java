package JavaConcepts;

public abstract class shape
{
	int sides, area;
	
	public abstract void draw();


 public void display()
 {
	 System.out.println("Sides are: "+sides+"Area is: "+area);
 } 
 

}

//Cannot access the concrete method as we would need an object 

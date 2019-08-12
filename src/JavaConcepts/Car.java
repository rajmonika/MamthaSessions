package JavaConcepts;

public class Car extends Vehicle {
	
	public void start()
	{
		System.out.println("Car ---- Start");
	}
	
	public void stop()
	{
		System.out.println("Car ---- Stop");
	}
	
	public void refuel()
	{
		System.out.println("Car ---- Refuel");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();
		c.start();
		c.refuel();
		c.stop();
		c.engine();
		
		Car c2 = new BMW();
		c2.start();
		
	}

}

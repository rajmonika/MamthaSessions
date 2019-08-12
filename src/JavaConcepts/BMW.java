package JavaConcepts;

public class BMW extends Car{
	
	public void start()
	{
		System.out.println("BMW ---Modified ---- Start");
	}
	
	public void theftsafety()
	{
		System.out.println("BMW ---- TheftSafety");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW b = new BMW();
		b.start();
		b.refuel();
		b.theftsafety();
		b.stop();
		b.engine();
		
		Car c1 = new BMW();
		c1.start();
				

	}

}

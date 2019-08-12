package JavaConcepts;

public class TwoDimArray {

	public static void main(String[] args) {

		int x[][] = new int [4][5];
		
		// object Emp1[] = new object[6];
		//Emp1[0] = "Chris"; //string
		//Emp1[1]= 25; //int
		//Emp1[2]= 'M'; //char
		//System.out.println(Emp1[4]);
		//System.out.println(Emp1.length);
		
		
		x[0][0] = 10;
		x[0][1] = 20;
		x[0][2] = 30;
		x[0][3] = 40;
		x[0][4] = 90;
		
		x[1][0] = 50;
		x[1][1] = 60;
		x[1][2] = 70;
		x[1][3] = 80;
		x[1][4] = 90;
		
		x[2][0] = 90;
		x[2][1] = 100;
		x[2][2] = 110;
		x[2][3] = 120;
		x[2][4] = 90;
		
		x[3][0] = 130;
		x[3][1] = 140;
		x[3][2] = 150;
		x[3][3] = 160;
		x[3][4] = 90;
		
		System.out.println("Size of the Rows: "+ x.length); // total no. of rows
		
		System.out.println("Size of the columns: "+x[3].length); //total no. of columns
		
		System.out.println("Printing the 2D Array");
		
		for(int row=0; row<x.length; row++)
		{
			for(int col=0; col<x[0].length; col++)
			{
				System.out.println(x[row][col]);
			}
		}

	}

}

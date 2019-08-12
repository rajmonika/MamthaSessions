package JavaConcepts;

public class OneDimArray {

	public static void main(String[] args) {

		int i[] = new int[5];
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;

		System.out.println("Print value at index 2: "+i[1]);
		
		//System.out.println(i[5]); // Doesn't exists - IndexOutOfBoundException
		
		System.out.println("Size of Array: "+i.length);
		
		//Print all values of Array - Use for loop
		
		for(int j=0; j<i.length; j++)
		{
			System.out.println(i[j]);
		}
	}

}

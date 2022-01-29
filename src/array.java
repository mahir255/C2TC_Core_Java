
public class array {
	public static void main(String[] args)
	{ 
		byte[][] arr = new byte[2][3];
		System.out.println(arr);   //reference to the 2D Array
		
		System.out.println(arr[0]); //reference to the 1D Array
		
		System.out.println(arr[0][0]); //element store at [0] [0], default value of byte here
	}
}
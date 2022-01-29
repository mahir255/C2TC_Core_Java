
public class array3d {
	public static void main(String[] args) {
		byte[][][] x= {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
		
		System.out.println(x[0][1][2]);
		
		System.out.println(x[1][0][1]);
		
		System.out.println(x[1][1][1]);
		 
		System.out.println(x[1][2][0]); //Array index out of bound exception
		
		System.out.println(x[2][1][0]); //Array index out of bound exception
	}
}

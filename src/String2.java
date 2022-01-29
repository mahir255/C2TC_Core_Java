
public class String2 {
	public static void main(String[] args) 
	{
//		String s="mahir ";
//		s=s.concat("karangale ");
//		
//		s=s+ "shashank ";
//		s+= "The great ";
//		
//		System.out.println(s);
	
		String a ="Mahir";
		int b=10,c=20,d=30;
		
		System.out.println(a+b+c+d);
		System.out.println(b+c+d+a);  // Once we encounter the String ,
		System.out.println(b+c+a+d);  // it consider rest expression 
		System.out.println(b+a+c+d);  // as a String
	}
}

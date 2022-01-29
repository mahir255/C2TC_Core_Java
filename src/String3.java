
public class String3 {
	public static void main(String[] args)
	{
		
		String s1= new String("Mahir");    
		String s2= new String("Mahir");
		
		System.out.println(s1==s2);    //Reference(s1 & s2 here) Comparison
		System.out.println(s1.equals(s2));   //Content(Mahir here) Comparison 
	
		//---------------------------------------------------------
		
		StringBuffer s3= new StringBuffer("Mahir");
		StringBuffer s4= new StringBuffer("Mahir"); 
	
		System.out.println(s3==s4);    //Reference(s1 & s2 here) Comparison
		System.out.println(s3.equals(s4));   //Reference Comparison
		
		
		//-----------------------------------------------------------
		
	}
}

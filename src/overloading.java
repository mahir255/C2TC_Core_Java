public class overloading 
{

	public void m()
	{
		System.out.println("No parameters");
	}
	public void m(int i)
	{
		System.out.println("I am Integer Method");
		
	}
	public void m(double d)
	{
		System.out.println("I am Double Method");
	}
	
	public static void main(String[] args) {
		
		overloading obj=new overloading();
		obj.m();
		obj.m(8);
		obj.m(2.5);
	}
	
}

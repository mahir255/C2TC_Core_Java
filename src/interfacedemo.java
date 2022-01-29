interface A
{
	void Adisplay();
}

interface B
{
	void Bdisplay();
}

class MIE implements A,B//Multiple Inheritance Execution
{

	public void Adisplay() {
		System.out.println("I am A");
	}

	public void Bdisplay() {
		System.out.println("I am B");	
	}
	
}

public class interfacedemo {
	public static void main(String[] args) {
		MIE obj = new MIE();
		obj.Adisplay();
		obj.Bdisplay();
	}
}
	
	
	
	
	
	
	
	
	
	



package Inheritance;

class Values
	{
		int area ;
		int length = 10, breadth = 20;
	}
	

class Area extends Values{
	void calculateArea() 
	{
		area = length*breadth;
		System.out.println("Area is "+ (area));
	}
}

public class single{
	public static void main(String[] args) 
	{
		Area a = new Area();
		a.calculateArea();
	}
}














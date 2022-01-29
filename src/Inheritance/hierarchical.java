package Inheritance;

class A {
	int area, volume;
	int length=10, breadth=20, height=30;
}

class B extends A{
	void calculateArea() {
		area = length*breadth;
		System.out.println("Area is "+(area));
	}
}

class C extends A{
	void calculateVolume() {
		volume = length*breadth*height;
		System.out.println("Volume is "+(volume));
	}
}


public class hierarchical{
	public static void main(String[] args) {
		B b = new B();
		b.calculateArea();
		
		C c = new C();
		c.calculateVolume();
	}
}

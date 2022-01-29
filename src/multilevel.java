

class animal{
	void animal() {
		System.out.println("Eating");
	}
}

class Cat extends animal{
	void cat() {
		System.out.println("Meow");
	}
}

class Kitten extends Cat{
	void kitten() {
		System.out.println("crying");
	}
}

public class multilevel{
	public static void main(String[] args) {
			
		Kitten k = new Kitten();
		k.animal();
		k.cat();
		k.kitten();	
	}
}




import java.util.Scanner;
public class Rectangle_Area {

	public static void main(String[] args) { // TODO Auto-generated method stub
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the length ="); 
	double length = scanner.nextDouble();
	
	System.out.println("Enter the width =");
	double width= scanner.nextDouble();
	
	
	double area = length*width; 
	System.out.println("Area of Rectangle ="+area); 
	}
}
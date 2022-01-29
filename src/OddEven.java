import java.util.Scanner;
public class OddEven {
	
	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter an Number: ");
		
		Scanner input = new Scanner(System.in);
		num= input.nextInt();
		
		if(num % 2 ==0)
			System.out.println("Even");
		else
			System.out.println("ODD");
	}
}

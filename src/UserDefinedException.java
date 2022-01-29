import java.util.Scanner;
public class UserDefinedException {
		public static void main(String[] args)  {
			int marks;
			System.out.println("enter your marks");
			Scanner s=new Scanner(System.in);
			marks=s.nextInt();
			
			if(marks<35) {
				throw new Fail("You are Failed");
			}
			else {
				System.out.println("You are Passed");
			}
			
		}
	}

	class Fail extends RuntimeException
	{
		Fail (String msg){
			super(msg);
		}
	}


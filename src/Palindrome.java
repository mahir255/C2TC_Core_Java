import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n= sc.nextInt();
		System.out.print("The "+n+" is a ");
		int ans=0,temp = n;
		
		while(n>0) {
			int rem = n%10;
			n/=10;
			ans = ans*10+rem;
		}
		
		if(temp==ans) {
			System.out.print("This is an Palindrome number.");
			}
			else {
				System.out.println("This is not an Palindrome number.");
			}
	}
}
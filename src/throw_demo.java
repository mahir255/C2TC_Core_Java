import java.util.Scanner;
public class throw_demo {
	public static void main(String[] args) throws CantVote {
		int age;
		System.out.println("enter your age");
		Scanner s=new Scanner(System.in);
		age=s.nextInt();
		
		if(age<18) {
			throw new CantVote("you cannot cast your vote");
		}
		else {
			System.out.println("you can happily vote");
		}
		
	}
}

//class CantVote extends RuntimeException
//{
//	CantVote (String msg){
//		super(msg);
//	}
//}

class CantVote extends Exception
{
	CantVote (String msg){
		super(msg);
	}
}
import java.util.ArrayList;

public class collection {
	public static void main(String[] args)
	{
		ArrayList l = new ArrayList();
		l.add("A");
		l.add(10);
		l.add("B");
		l.add("A");
		l.add(null);
		System.out.println(l);
		
		l.remove(1);
		System.out.println(l);
		
		l.add(2,"N");
		System.out.println(l);
	}
}

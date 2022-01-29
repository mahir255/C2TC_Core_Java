
public class Methodoverriding {
	
	public static void main(String []args) {
		 night obj = new night();  
		 obj.run();
		
		
	}

}
class morning{  
	   
	  void run(){
		  System.out.println("Good Morning");
	  }  
	}  
	  
class night extends morning{  
	  
	  void run(){
		  System.out.println("Good Night");
	  }  
}
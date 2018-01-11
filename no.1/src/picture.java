
public class picture {
	public static int size;
	picture(){
		size=7;
	}
	public static void display(){
		for (int i = 0; i < size / 2 + 1; i++) { 
		      for (int j = size / 2 + 1; j > i + 1; j--) { 
		        System.out.print(" ");
		      } 
		      for (int j = 0; j < 2 * i + 1; j++) { 

		          System.out.print("*");
		      } 
		      System.out.println(""); 
		    } 
		    for (int i = size / 2 + 1; i < size; i++) { 
		      for (int j = 0; j < i - size / 2; j++) { 
		        System.out.print(" ");
		      } 
		      for (int j = 0; j < 2 * size - 1 - 2 * i; j++) { 

		          System.out.print("*");

		      } 
		      System.out.println(""); 
		    } 
		  
	}
    
}

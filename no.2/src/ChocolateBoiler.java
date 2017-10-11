
public class ChocolateBoiler {
	private static boolean empty;
	private static boolean boiled;
	ChocolateBoiler(){
		empty=true;
		boiled=false;
	}
	public static void fill(){
		if(empty){
			System.out.println("Fill in chocolate and milk");
			empty=false;
		}
		else{
			System.out.println("Full error");
		}
	}
	public static void boil(){
		if(!empty && !boiled){
			System.out.println("Boiling...");
			boiled=true;
		}
		else{
			System.out.println("error");
		}
	}
	public static void drain(){
		if(!empty && boiled){
			System.out.println("draining out ");
			empty=true;
			boiled=false;
		}
		else{
			System.out.println("error");
		}	
	}
	public static boolean isEmpty(){
		return empty;
	}
	public static boolean isBoiled(){
		return boiled;
	}
	public static void main(String[] arge){
		ChocolateBoiler cb=new ChocolateBoiler();
		System.out.println("Empty :"+cb.isEmpty()+"  Boiled :"+cb.isBoiled());
		cb.fill();
		System.out.println("Empty :"+cb.isEmpty()+"  Boiled :"+cb.isBoiled());
		cb.boil();
		System.out.println("Empty :"+cb.isEmpty()+"  Boiled :"+cb.isBoiled());
		cb.drain();
		System.out.println("Empty :"+cb.isEmpty()+"  Boiled :"+cb.isBoiled());
	}
}

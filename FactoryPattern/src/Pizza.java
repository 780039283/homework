
public class Pizza {
	public static String type;
	
	public static void prepare(){
		System.out.println(type+"Pizza 正在准备材料...");
	}
	public static void bake(){
		System.out.println(type+"Pizza 正在烘焙披萨...");
	}
	public static void cut(){
		System.out.println(type+"Pizza 正在切割披萨...");
	}
	public static void box(){
		System.out.println(type+"Pizza 正在包装披萨...");
	}

}

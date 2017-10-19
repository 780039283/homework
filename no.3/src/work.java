
public class work {
	public static void main(String[] arge){
		PizzaStore ps=new PizzaStore();
		System.out.println("请下订单 ...\n");
		System.out.println("CheesePizza 制作中.. ");
		ps.orderPizza("cheese");
		System.out.println("\nPepperoniPizza 制作中.. ");
		ps.orderPizza("pepperoni");
		System.out.println("\nClamPizza 制作中.. ");
		ps.orderPizza("clam");
	}

}

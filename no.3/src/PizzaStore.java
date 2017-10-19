
public class PizzaStore {
	private static SimplePizzaFactory sp;
	private static Pizza p;
	PizzaStore(){
		sp=new SimplePizzaFactory();
	}
	public static Pizza orderPizza(String type){
		p=sp.createPizza(type);
		p.prepare();
		p.cut();
		p.bake();
		p.box();
		return p;
	}

}

public class NYPizzaStore extends PizzaStore{
	
	public Pizza factoryMethod (String type) {
		Pizza pizza = null;
		
		if (type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new NYStylePepperoniPizza();
		}
		return pizza;
	}
}

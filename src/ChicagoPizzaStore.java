public class ChicagoPizzaStore extends PizzaStore{
	
	public Pizza factoryMethod (String type) {
		Pizza pizza = null;
		
		if (type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new ChicagoStylePepperoniPizza();
		}
		return pizza;
	}
}


public class CaliforniaPizzaStore extends PizzaStore{
	
	public Pizza factoryMethod (String type) {
		Pizza pizza = null;
		
		if (type.equals("cheese")) {
			pizza = new CaliforniaStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new CaliforniaStylePepperoniPizza();
		}
		return pizza;
	}
}

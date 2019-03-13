public abstract class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = factoryMethod(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	protected abstract Pizza factoryMethod(String type);
}

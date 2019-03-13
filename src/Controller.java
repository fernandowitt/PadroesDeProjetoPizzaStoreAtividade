public class Controller {

	public static void main(String[] args) {
		
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		PizzaStore californiaStore = new CaliforniaPizzaStore();
		
		Pizza pizza1 = nyStore.orderPizza("cheese");
		
		Pizza pizza2 = chicagoStore.orderPizza("cheese");

		Pizza pizza3 = californiaStore.orderPizza("cheese");
		
		Pizza pizza4 = nyStore.orderPizza("pepperoni");
		
		Pizza pizza5 = chicagoStore.orderPizza("pepperoni");
		
		Pizza pizza6 = californiaStore.orderPizza("pepperoni");
	}
}

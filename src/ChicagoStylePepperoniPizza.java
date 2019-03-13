public class ChicagoStylePepperoniPizza extends Pizza {

	public ChicagoStylePepperoniPizza() {
		name = "Chicago style Pepperoni";
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices (Chicago preference)");
	}
}

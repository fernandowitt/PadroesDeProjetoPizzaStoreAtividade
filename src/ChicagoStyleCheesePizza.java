public class ChicagoStyleCheesePizza extends Pizza{

	public ChicagoStyleCheesePizza() {
		name = "Chicago style Cheese";
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices (Chicago preference)");
	}
}

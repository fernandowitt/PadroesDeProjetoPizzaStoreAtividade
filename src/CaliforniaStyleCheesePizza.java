
public class CaliforniaStyleCheesePizza extends Pizza{

	public CaliforniaStyleCheesePizza() {
		name = "California style Cheese";
	}
	
	@Override
	public void bake() {
		System.out.println("Bake for 30 minutes at 300 degrees");
	};
}

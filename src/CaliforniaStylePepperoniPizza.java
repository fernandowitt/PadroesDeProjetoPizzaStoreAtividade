
public class CaliforniaStylePepperoniPizza extends Pizza{

	public CaliforniaStylePepperoniPizza() {
		name = "California style Pepperoni";
	}
	
	@Override
	public void bake() {
		System.out.println("Bake for 30 minutes at 300 degrees");
	};
}

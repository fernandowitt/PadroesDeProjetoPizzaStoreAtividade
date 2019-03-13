public abstract class Pizza {
	
	protected String name;

	public void prepare() {
		System.out.println("Preparing the pizza " + name);
	};
	public void bake() {
		System.out.println("Bake for 25 minutes at 350 degrees");
	};
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");	
	}
	
	public void box() {
		System.out.println("Place pizza in official company box\n");
	}
	
	public String getName() {
		return name;
	}
}

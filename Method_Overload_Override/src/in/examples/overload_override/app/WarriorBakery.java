package in.examples.overload_override.app;

public class WarriorBakery extends Bakery {
	@Override
	public void bake() {
		System.out.println("Calling SUB class method with no-arg");
	}

	@Override
	public void bake(String item) {
		System.out.println("Calling SUB class method with String-arg");
		System.out.println("Item : " + item);
	}

	@Override
	public void bake(double cost) {
		System.out.println("Calling SUB class method with double-arg");
		System.out.println("Cost : " + cost);
	}

	@Override
	public void bake(int noOfItem) {
		System.out.println("Calling SUB class method with int-arg");
		System.out.println("No Of Item : " + noOfItem);
	}

	@Override
	public void bake(String item, double cost) {
		System.out.println("Calling SUB class method String,double no-arg");
		System.out.println("Item : " + item);
		System.out.println("Cost : " + cost);
	}

	@Override
	public void bake(String item, int noOfItem, double cost) {
		System.out.println("Calling SUB class method with String,int,double-arg");
		System.out.println("Item : " + item);
		System.out.println("No OF Items : " + noOfItem);
		System.out.println("Cost : " + cost);
	}
}

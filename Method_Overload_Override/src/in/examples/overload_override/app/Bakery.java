package in.examples.overload_override.app;

public class Bakery {
	public void bake() {
		System.out.println("Calling PARENT class method with no-arg");
	}

	public void bake(String item) {
		System.out.println("Calling PARENT class method with String-arg");
		System.out.println("Item : " + item);
	}

	public void bake(double cost) {
		System.out.println("Calling PARENT class method with double-arg");
		System.out.println("Cost : " + cost);
	}

	public void bake(int noOfItem) {
		System.out.println("Calling PARENT class method with int-arg");
		System.out.println("No Of Item : " + noOfItem);
	}

	public void bake(String item, double cost) {
		System.out.println("Calling PARENT class method String,double no-arg");
		System.out.println("Item : " + item);
		System.out.println("Cost : " + cost);
	}

	public void bake(String item, int noOfItem, double cost) {
		System.out.println("Calling PARENT class method with String,int,double-arg");
		System.out.println("Item : " + item);
		System.out.println("No OF Items : " + noOfItem);
		System.out.println("Cost : " + cost);
	}
}

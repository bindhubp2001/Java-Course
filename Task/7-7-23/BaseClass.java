class BaseClass{
	System.out.println("Base Class");
}
class Derrived extends BaseClass{
	System.out.println("Derrived Class");
}
class Child extends Derrived{
	public static void main(String[] args){
		System.out.println("Running Chind Clas");
		Child obj = new Child;
	}
}
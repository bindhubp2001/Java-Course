class BaseClass{
	System.out.println("Base Class");
}
class Derrived extends BaseClass{
	System.out.println("Derrived Class");
}
class Child extends Derrived{
	
		System.out.println("Running Chind Clas");
		

}
class MainClass{
	public static void main(String[] args){
		Child obj = new Child;
	}
}
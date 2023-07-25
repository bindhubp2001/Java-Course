class BaseClass{
	static void method1(){
	System.out.println("Base Class");
	}
}
class Derrived extends BaseClass{
	static void method2(){
	System.out.println("Derrived Class");
	}
}
class Child extends Derrived{
	void method3(){
		System.out.println("Running Chind Clas");
	}

}
class MainClass{
	public static void main(String[] args){
		Child obj = new Child();
		obj.method3();
	}
}
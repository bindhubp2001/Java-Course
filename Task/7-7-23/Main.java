class BaseClass{
	System.out.println("This is base class");
	
}
class Method extends BaseClass{
	
		System.out.println("Method overrides from Override Class")
}
class Main extends Method{
	public static void main(String[] args){
		Method obj = new Method();
		
	}
}

class Override{
	
	static void add(int a,int b){
		System.out.println(a+b);
	}
	
}
class Method extends Override{
	
		
		
		static void add(int a,int b){
		System.out.println(a+b);
	}
}
class Main{
	public static void main(String[] args){
		Method obj = new Method();
		obj.add(1,2);
	}
}

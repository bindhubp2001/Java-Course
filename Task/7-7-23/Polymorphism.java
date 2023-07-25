class Polymorphism{
	static public void main(String[] args){
		add("Ram","Sitha");
		add(1,2);
		
	}
	static void add(int a,int b){
		System.out.println(a+b);
	}
	static void add(String a,String b){
		System.out.println(a+b);
	}
}
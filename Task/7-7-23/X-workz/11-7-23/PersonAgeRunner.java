class PersonAgeRunner{
	public static void main(String[] args){
		byte age=Person.getAgeByName("Dhoni");
		System.out.println("Age of Dhoni is : "+age);
		
		byte age1=Person.getAgeByName("Chandu");
		System.out.println("Age of Chandu is : "+age1);
		
		byte age2=Person.getAgeByName("fathima");
		System.out.println("Age of fathima is : "+age2);
		
		byte age3=Person.getAgeByName(null);
		System.out.println(age3);
		
		byte age4=Person.getAgeByName("Bindhu");
		System.out.println(age4);
	}
}
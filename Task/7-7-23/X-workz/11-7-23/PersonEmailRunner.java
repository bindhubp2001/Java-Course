class PersonEmailRunner{
	public static void main(String[] args){
		String mail=PersonEmail.getEmailByName("Dhoni");
		System.out.println("Age of Dhoni is : "+mail);
		
		String mail1=PersonEmail.getEmailByName("Chandu");
		System.out.println("Age of Chandu is : "+mail1);
		
		String mail2=PersonEmail.getEmailByName("fathima");
		System.out.println("Age of fathima is : "+mail2);
		
		String mail3=PersonEmail.getEmailByName(null);
		System.out.println(mail3);
		
		String mail4=PersonEmail.getEmailByName("Bindhu");
		System.out.println(mail4);
	}
}
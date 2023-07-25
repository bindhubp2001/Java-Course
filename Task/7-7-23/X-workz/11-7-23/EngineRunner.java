class MainRunner{
	public static void main(String[] args){
		
		String model1 = "Swift";
		int cc1 = Engine.getCcByModel(model1);
		System.out.println(model1+ " CC : "+cc1);
		
		int cc2 = Engine.getCcByModel("Bently");
		System.out.println("Bently Model CC : "+cc2);
		
		String model2 = "Audi";
		int cc3 = Engine.getCcByModel(model2);
		System.out.println(model2+ " CC : "+cc3);
		
		int cc4 = Engine.getCcByModel("Rapid");
		System.out.println("Rapid Model CC : "+cc4);
		
		int cc5 = Engine.getCcByModel("Nexon");
		System.out.println("Nexon Model CC : "+cc5);
		
		int cc6 = Engine.getCcByModel(null);
		System.out.println(cc6);
	}
}
class FabricRunner{
	public static void main(String[] args){
		
		String name1 = "Cotton";
		float cost1 = Fabric.getPrice(name1);
		System.out.println(name1+ " is of cost : "+cost1);
		
		float cost2 = Fabric.getPrice("Nylon");
		System.out.println("Nylon is of cost : "+cost2);
		
		String name2 = "polyster";
		float cost3 = Fabric.getPrice(name2);
		System.out.println(name2+ " is of cost : "+cost3);
		
		float cost4 = Fabric.getPrice("silk");
		System.out.println("Silk Model CC : "+cost4);
		
		float cost5 = Fabric.getPrice("denim");
		System.out.println("Denim is of cost : "+cost5);
		
		float cost6 = Fabric.getPrice(null);
		System.out.println(cost6);
	}
}
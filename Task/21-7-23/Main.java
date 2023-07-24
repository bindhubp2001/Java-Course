class Main
{
	public static void main(String[] args)
	{
		System.out.println("\n-------Helmet Class--------------");
		Helmet helmet = new Helmet();
		System.out.println("Printing Instance variable values");
		helmet.helmateInstanceMethod();
		System.out.println("\nPrinting Static variablr values");
		Helmet.helmateStaticMethod();
		
		System.out.println("\n-------Brick Class--------------");
		Brick brick = new Brick();
		brick.brickInstanceMethod();
		Brick.brickStaticMethod();
		
		System.out.println("\n---------Bureau Class-------------");
		Bureau bureau = new Bureau(2,"Store Books");
		bureau.bureauInstanceMethod();
		Bureau.bureaStaticMethod();
		
		System.out.println("\n-----------Candle Class------------");
		Candle candle=new Candle();
		candle.candleInstanceMethod();
		Candle.candleStaticMethod();
		
		System.out.println("\n----------Soil Class--------------");
		Soil soil=new Soil();
		soil.soilInstanceMethod();
		Soil.soilStaticMethod();
		
		System.out.println("\n---------Power Class-------------");
		Power power=new Power();
		power.powerInstanceMethod();
		Power.powerStaticMethod();
		
		System.out.println("\n----------Butter Fly Class-------------");
		Butterfly butterfly = new Butterfly();
		butterfly.butterflyInstanceMethod();
		Butterfly.butterflyStaticMethod();
	}
}
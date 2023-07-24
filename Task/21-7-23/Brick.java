class Brick
{
	String shape;
	boolean isWellBurnt;
	static String material;
	static double size;
	
	Brick()
	{
		this.shape = "Rectangle";
		this.isWellBurnt=true;
	}
	void brickInstanceMethod()
	{
		System.out.println("Printing Instance Variable Value");
		System.out.println("SHAPE : "+shape);
		System.out.println("IS WELL BURNT : "+isWellBurnt);
	}
	static
	{
		material="CLAY";
		size=90;
	}
	static void brickStaticMethod()
	{
		System.out.println("\nPrinting Static Variables Value");
		System.out.println("MATERIAL : "+material);
		System.out.println("SIZE : "+size);
	}
}
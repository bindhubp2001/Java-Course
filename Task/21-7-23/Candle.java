class Candle
{
	static String candleMadeOf;
	static boolean isScentedCandle;
	int noOfCandle;
	double cost;
	
	Candle()
	{
		this.noOfCandle=10;
		this.cost=99;
	}
	
	void candleInstanceMethod()
	{
		System.out.println("Printing Instance Variable values");
		System.out.println("NO OF CANDLES are : "+noOfCandle);
		System.out.println("COST : "+cost);
	}
	
	static
	{
		candleMadeOf = "Paraffin Wax";
		isScentedCandle = true;
	}
	
	static void candleStaticMethod()
	{
		System.out.println("\nPrinting Static Variable values");
		System.out.println("CANDLE IS MADE OF : "+candleMadeOf);
		System.out.println("IS SCENTED CANDLE : "+isScentedCandle);
	}
}
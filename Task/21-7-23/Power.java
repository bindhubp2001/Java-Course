class Power
{
	static char siUnit;
	static String formula;
	boolean isOn;
	boolean isOff;
	
	Power()
	{
		this.isOn=true;
		this.isOff=false;
	}
	
	void powerInstanceMethod()
	{
		System.out.println("Printing Instance Variable values");
		System.out.println("IS ON : "+isOn);
		System.out.println("IS OFF: "+isOff);
	}
	
	static
	{
		siUnit='W';
		formula="work/Time";
	}
	
	static void powerStaticMethod()
	{
		System.out.println("\nPrinting Static Variable values");
		System.out.println("SI UNIT OF POWER : "+siUnit);
		System.out.println("FORMULA : "+formula);
	}
}
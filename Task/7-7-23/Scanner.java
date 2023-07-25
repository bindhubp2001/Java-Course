class Scanner{
	static void qrCode(double amount,String shopType,boolean isSmartSpeaker){
		
		System.out.println("\nAmount need to Transfered : "+amount);
		System.out.println("Type of Shop : "+shopType);
		System.out.println("Have SmartSpeaker : "+isSmartSpeaker);
		
		if(amount>10)
		{
			System.out.println("\nAmount is Valid");
		}
		else
		{
			System.out.println("Amount is Not Valid");
			return;
		}
		if(shopType!=null)
		{
			System.out.println("Shop Type is Pointing to memory");
		}
		else
		{
			System.out.println("Shop Type is not Pointing to memory");
			return;
		}
		if(isSmartSpeaker==true)
		{
			System.out.println("Scanner have smartSpeaker");
		}
		else
		{
			System.out.println("Scanner not have smartSpeaker");
			return;
		}
		
		System.out.println("Arguments given are Valid");
	}
}
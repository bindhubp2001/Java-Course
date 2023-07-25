class Soda{
	static void drinks(String sodaType,int noOfBottel,String color,boolean tastesGood,double rsPerBottel){
		
		System.out.println("\n Soda Type : "+sodaType);
		System.out.println("No Of Bottels : "+noOfBottel);
		System.out.println("Color of Soda : "+color);
		System.out.println("Tastes Good : "+tastesGood);
		System.out.println("Rupees/Bottel : "+rsPerBottel);
		
		if(sodaType!=null)
		{
			System.out.println("\nSoda Type is pointing to memory");
		}
		else
		{
			System.out.println("Soda Type is not pointing to memory");
			return;
		}
		if(noOfBottel>0)
		{
			System.out.println("No OF Bottel is Valid");
		}
		else
		{
			System.out.println("No OF Bottel is not Valid");
			return;
		}
		if(color!=null)
		{
			System.out.println("Color is pointing to memory");
		}
		else
		{
			System.out.println("Color is not pointing to memory");
			return;
		}
		if(tastesGood==true)
		{
			System.out.println("Soda Tastes Good");
		}
		else
		{
			System.out.println("Soda Does not Tastes Good");
			return;
		}
		if(rsPerBottel>=20)
		{
			System.out.println("Rupees per Bottel is Valid");
		}
		else
		{
			System.out.println("Rupees per Bottels is not Valid");
			return;
		}
		System.out.println("All Arguments are Valid");
	}
}
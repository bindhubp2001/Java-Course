class Dumbell{
	int noOfPairs;
	float weight;
	int size;
	
	Dumbell()
	{
		System.out.println("Calling Dafault Constuuctor");
		System.out.println("Number of pairs : "+this.noOfPairs);
		System.out.println("Weight of Dumbells : "+this.weight);
		System.out.println("Size of Dumbell : "+this.size);
		this.noOfPairs=3;
		this.weight=100;
		this.size=10;
		
	}
	Dumbell(int noOfPairs,float weight, int size)
	{
		System.out.println("Calling Parameterized Constuuctor");
		this.noOfPairs=noOfPairs;
		this.weight=weight;
		this.size=size;
	}
}
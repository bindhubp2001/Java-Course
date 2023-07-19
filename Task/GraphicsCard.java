 class GraphicsCard{
	String model;
    int vram;
    int clockSpeed;
	
	GraphicsCard()
	{
		System.out.println("Calling Dafault Constuuctor");
		System.out.println("MODEL: "+this.model);
		System.out.println("VRAM : "+this.vram);
		System.out.println("Clockspeed : "+this.clockSpeed);
		this.model="Integrated";
		this.vram=4;
		this.clockSpeed = 25;
		
	}
	GraphicsCard(String model,int vram,int clockSpeed)
	{
		System.out.println("Calling Parameterized Constuuctor");
		this.model=model;
		this.vram=vram;
		this.clockSpeed=clockSpeed;
		
		
	}
	
 }
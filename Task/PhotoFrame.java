class PhotoFrame{
	String material;
    String color;
    int width;
    int height;
	
	PhotoFrame()
	{
		System.out.println("Calling Dafault Constuuctor");
		System.out.println("MATERIAL: "+this.material);
		System.out.println("COLOR : "+this.color);
		System.out.println("WIDTH : "+this.width);
		System.out.println("HEIGHT : "+this.height);
		
		this.material="Wood";
		this.color="Brown";
		this.width=50;
		this.height=50;
		
	}
	PhotoFrame(String material,String color,int width,int height)
	{
		System.out.println("Calling Parameterized Constuuctor");
		this.material=material;
		this.color=color;
		this.width=width;
		this.height=height;
	}
}
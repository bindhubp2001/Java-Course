class Main{
	public static void main(String[] args){
		
	System.out.println("Invoking main method in Main Class");
		
		Dumbell dumbell1 = new Dumbell();
		System.out.println(dumbell1.noOfPairs);
		System.out.println(dumbell1.weight);
		System.out.println(dumbell1.size);
		
		Dumbell dumbell2 = new Dumbell(4,150,12);
		System.out.println(dumbell2.noOfPairs);
		System.out.println(dumbell2.weight);
		System.out.println(dumbell2.size);
		
		Police police1 = new Police();
		System.out.println(police1.type);
		System.out.println(police1.gender);
		System.out.println(police1.badgrNumber);
		
		Police police2 = new Police("Forest","MALE",90);
		System.out.println(police2.type);
		System.out.println(police2.gender);
		System.out.println(police2.badgrNumber);
		
		GraphicsCard graphicsCard1 = new GraphicsCard();
		System.out.println(graphicsCard1.model);
		System.out.println(graphicsCard1.vram);
		System.out.println(graphicsCard1.clockSpeed);
		
		GraphicsCard graphicsCard2 = new GraphicsCard("INtegrated",5,30);
		System.out.println(graphicsCard2.model);
		System.out.println(graphicsCard2.vram);
		System.out.println(graphicsCard2.clockSpeed);
		
		
		Boat boat1 = new Boat();
		System.out.println(boat1.name);
		System.out.println(boat1.length);
		System.out.println(boat1.capacity);
		
		Boat boat2 = new Boat("Tiatanic2",800,200);
		System.out.println(boat2.name);
		System.out.println(boat2.length);
		System.out.println(boat2.capacity);
		
		PhotoFrame photoFrame1 = new PhotoFrame();
		System.out.println(photoFrame1.material);
		System.out.println(photoFrame1.color);
		System.out.println(photoFrame1.width);
		System.out.println(photoFrame1.height);
		
		
		PhotoFrame photoFrame2 = new PhotoFrame("sandelWood","Brown",70,90);
		System.out.println(photoFrame2.material);
		System.out.println(photoFrame2.color);
		System.out.println(photoFrame2.width);
		System.out.println(photoFrame2.height);
		
	}
}
class TrainRunner{
	public static void main(String[] args){
		
		int tNo1 = 11013;
		String tname = Train.trainName(tNo1);
		System.out.println(tNo1+" this number belongs to "+tname);
		
		String tname2 = Train.trainName(11014);
		System.out.println("11014 this number belongs to : "+tname2);
		
		String tname3 = Train.trainName(22691);
		System.out.println("22691 this number belongs to : "+tname3);
		
		String tname4 = Train.trainName(0);
		System.out.println(tname4);
		
		String tname5 = Train.trainName(12345);
		System.out.println(tname5);
	}
}
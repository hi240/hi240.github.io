package kr.or.bit;
/*
public class TestAir {
	public static void main(String[] args) {
		//Airplane air = new Airplane();
		//air.makeAirPlane(101,"대한");
		//air.airPlaneTotalCount();	
		AirPlane air = new AirPlane();
		air.airInfo("KO",2 );
		//air.airCount();
		AirPlane air2 = new AirPlane();
		air2.airInfo("KO",2);
		System.out.println("총 누적대수는"+air.airCount());	
	}
}*/
public class TestAir {
	public static void main(String[] args) {
		
		AirPlane air = new AirPlane("KO",2 );
		AirPlane air2 = new AirPlane("KO",2 );
		AirPlane air3 = new AirPlane("KO",2 );
	
		System.out.println("총 누적대수는"+air.airCount());
		
	}
	
}
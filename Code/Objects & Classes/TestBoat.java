public class TestBoat {

	public static final void main(String args[]) {

	//instantiate a new instance of Car and call the variable c
		
		Boat b = new Boat("1928","23");
        b.start();
        b.moveForward(6);
        b.moveForward(4);
		System.out.println(b.getYear());
        System.out.println("The Boat went " + b.NMileage() + " Nautical Miles.");
	}
	
}

class Boat{

	private String make, year; 
	private double miles = 0;
	private boolean startBoat = false;
	public static final double NM = 1.1508d
	
	Boat(String Y, String M){
		
		year = Y;
		make = M;
		
	}

	
	public void start(){
		
		startBoat = true;
	
	}
	
	public void stop(){
	
		startBoat = false;
	
	}
	
	
	public void moveForward(int move){
	
		if(startBoat != false)
			miles += move;
	
	}
	
	public double NMileage(){
	
		return miles/NM;
	
	}
	
	public String getMake(){
	
		return make;
	
	}
	
	public String getYear(){
	
		return year;
	
	}
}

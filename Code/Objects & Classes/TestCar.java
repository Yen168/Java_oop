public class TestCar {

	public static final void main(String args[]) {

	//instantiate a new instance of Car and call the variable c
		
		Car c = new Car("1928","97","23");
        c.start();
        c.moveForward(6);
        c.moveBackward(2);
        c.moveForward(4);
		System.out.println(c.getModel());
        System.out.println("The car went " + c.mileage() + " miles.");
	}
	
}

class Car{

	private String make, model, year; 
	private int miles = 0;
	private boolean startCar = false;
	
	Car(){
	
	}
	
	Car(String Y){
		
		year = Y;
	
	}
	
	Car(String Y, String M){
		
		year = Y;
		make = M;
		
	}
	
	Car(String Y, String M, String mo){
		
		year = Y;
		make = M;
		model = mo;
	
	}
	
	public void start(){
		
		startCar = true;
	
	}
	
	public void stop(){
	
		startCar = false;
	
	}
	
	public void moveBackward(int move){
		
		if(startCar != false)
			miles -= move;
	
	}
	
	public void moveForward(int move){
	
		if(startCar != false)
			miles += move;
	
	}
	
	public int mileage(){
	
		return miles;
	
	}
	
	public String getMake(){
	
		return make;
	
	}
	
	public String getModel(){
	
		return model;
	
	}
	
	public String getYear(){
	
		return year;
	
	}
}
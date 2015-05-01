class Car extends Vehicle{
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
	
	public void moveForward(int i){
	
		if(startCar != false)
			miles += i;
	
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

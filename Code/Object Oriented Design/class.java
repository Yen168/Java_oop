
public class Bicycle {
	
	private int gear, cadence, speed;
	
	Bicycle(){
		
		gear = 0;
		cadence = 0;
		speed = 0;
	
	}
	
	
	Bicycle(int startCadence, int startGear){
		
		gear = startGear;
		cadence = startCadence;
		speed = 0;
	
	}
	
	Bicycle(int startCadence, int startSpeed, int startGear){
		
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;
	
	}
	
	public void setCadence(int cadence){
	
		this.cadence = cadence;
	
	};
	public void setSpeed(int speed){
	
		this.speed = speed;
	
	};
	public void setGear(int gear){
	
		this.gear = gear;
	
	};

		
	
}

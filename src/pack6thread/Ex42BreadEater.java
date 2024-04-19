package pack6thread;

public class Ex42BreadEater extends Thread{ //빵 생산자
	private Ex42BreadPlate plate;
	public Ex42BreadEater(Ex42BreadPlate plate) {
		this.plate = plate;
	}
	
	@Override
	public void run() {
		for(int i=0; i<30; i++) {    //빵먹는거 
			plate.eatBread();
			
		}
	}
}

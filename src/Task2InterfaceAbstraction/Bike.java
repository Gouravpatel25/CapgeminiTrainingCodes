package Task2InterfaceAbstraction;

public class Bike extends AbstractVehicle {
	Bike(String name, int speed){
		super(name,speed);
	}
	
	@Override
	public void start() {
		System.out.println("Bike started");
	}
	
	public void stop() {
		System.out.println("Bike stopped");
	}

	@Override
	public void displayType() {
		// TODO Auto-generated method stub
		System.out.println(this.speed);
		System.out.println(this.name);
	}
}

package Task2InterfaceAbstraction;

public class Car extends AbstractVehicle{

	Car(String name, int speed) {
		super(name, speed);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void start() {
		System.out.println("Car started");
	}
	
	@Override
	public void stop() {
		System.out.println("Car stopped");
	}


	@Override
	public void displayType() {
		// TODO Auto-generated method stub
		System.out.println(this.speed);
		System.out.println(this.name);
	}
}

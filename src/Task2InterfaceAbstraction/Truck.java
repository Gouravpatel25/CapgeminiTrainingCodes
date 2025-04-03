package Task2InterfaceAbstraction;

public class Truck extends AbstractVehicle {
	Truck(String name,int speed){
		super(name,speed);
	}
	
	@Override
	public void start() {
		System.out.println("Truck started");
	}
	
	public void stop() {
		System.out.println("Truck stopped");
	}

	@Override
	public void displayType() {
		// TODO Auto-generated method stub
		System.out.println(this.name);
		System.out.println(this.speed);
	}
}

package Task2InterfaceAbstraction;

abstract class AbstractVehicle implements Vehicle {
	protected String name;
	protected int speed;
	
	AbstractVehicle(String name,int speed){
		this.name=name;
		this.speed=speed;
	}
	
	void displayDetails() {
		System.out.println(this.speed);
		System.out.println(this.name);
	}
	
	//@Override
	public void accelerate(int increment) {
		speed +=increment;
		System.out.println(name+" accelerated speed is "+speed);
	}
	
	//@Override
	public void brake(int decrement) {
		speed=Math.max(0, speed-decrement);
		System.out.println(name+" slowed down to "+speed);
	}
	
	//@Override
	public int getCurrentSpeed() {
		return speed;
	}
}

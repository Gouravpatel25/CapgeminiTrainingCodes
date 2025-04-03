package Abstraction;

public class CalibrateDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calibrate c=new CalibrateImplementation();
		System.out.println(c.add(10, 20));
		System.out.println(c.sub(20, 30));
		System.out.println(
				c.mul(1,8));
	}

}

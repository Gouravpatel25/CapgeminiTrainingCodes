package Abstraction;

public class Calci1Imple extends AbstractCalci1 {
	
	@Override
	public double power(double a, double b) {
		return Math.pow(a, b);
	}

	@Override
	int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
}

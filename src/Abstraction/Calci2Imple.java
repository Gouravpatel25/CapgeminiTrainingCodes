package Abstraction;

public class Calci2Imple extends AbstractCalci2{
	
	@Override
	public  double square(double a) {
		return Math.pow(a, 2) ;
	}
	
	@Override
	public  double cube(double a) {
		return Math.pow(a, 3) ;
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

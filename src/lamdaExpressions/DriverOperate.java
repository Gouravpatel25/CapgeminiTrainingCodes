package lamdaExpressions;

public class DriverOperate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Without return
		operate o= (a,b) -> a+b;
		int res=o.operate(20, 30);
		System.out.println(res);

	}

}

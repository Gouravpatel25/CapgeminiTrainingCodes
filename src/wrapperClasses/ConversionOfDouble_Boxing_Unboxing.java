package wrapperClasses;

public class ConversionOfDouble_Boxing_Unboxing {
	public static void main(String[] args) {
		
		//AutoBoxing
		double d=10.09;
		Double dd=Double.valueOf(d);
		
		System.out.println(dd);
		
		int a=10;
		Integer i=Integer.valueOf(a);
		System.out.println(i);
		
		short s=89;
		Short ss=Short.valueOf(s);
		System.out.println(ss);
		
		byte b=4;
		Byte bb=Byte.valueOf(b);
		System.out.println(bb);
		
		boolean b1=true;
		Boolean b2=Boolean.valueOf(b1);
		
		System.out.println(b2);
		System.out.println("==============================================");
		
		
		//Unboxing
		
		Integer ii=new Integer(100);
		int ii2=ii.intValue();
		System.out.println(ii2);
		
		Byte bytu=20;
		byte bytee=bytu.byteValue();
		System.out.println(bytee);
		
		Boolean bulu=false;
		boolean bool=bulu.booleanValue();
		System.out.println(bool);
		}
	
}

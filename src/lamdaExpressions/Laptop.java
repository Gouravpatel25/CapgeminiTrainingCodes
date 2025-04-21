package lamdaExpressions;

public class Laptop {
	private int modelno;
	private String brand;

	Laptop(int modelno,String brand){
		this.modelno=modelno;
		this.brand=brand;
	}

	public int getModelno() {
		return modelno;
	}

	public void setModelno(int modelno) {
		this.modelno = modelno;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override 
	public String toString() {  //helps to override the toString() so that it doesn't return the reference address 
		return this.modelno + " " + this.brand;
	}

}

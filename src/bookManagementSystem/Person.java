package bookManagementSystem;

abstract class Person {
	protected int personId;
	protected String pName;
	abstract void showRole();
	
	
	public Person(int personId, String pName) {
		this.personId = personId;
		this.pName = pName;
	}


	public int getPersonId() {
		return personId;
	}


	public void setPersonId(int personId) {
		this.personId = personId;
	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}

	
	
	
}

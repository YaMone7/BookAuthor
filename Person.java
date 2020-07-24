package Inheritance;

public class Person {
	String name;
	String address;
	
	public Person(String n,String add) {
		this.name=n;
		this.address=add;
	}
	public String getName() {
		return name;
	}
	public String setName() {
		return name;
	}
	
		
	
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

}
package Inheritance;

public  class Student extends Person {
	String program;
	int year;
	double fee;
	String  student;
	
	public Student(String name,String address,String program,int year,double fee) {
		super(name, address);
		this.program=program;
		this.year=year;
		this.fee=fee;
		this.student=student;
	}
	public static void main(String[] args) {

	}

}

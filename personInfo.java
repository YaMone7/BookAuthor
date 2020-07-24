package Inheritance;

public class personInfo {

	public static void main(String[] args) {
		
		Person per1=new Person("Ko Aung", "Dawei");
		Person per2=new Person("Mi Mi", "Laung Lone");
		Student stud=new Student(per1.name,per1.address,"Intermediate Level",3,120000.0);
		Staff st=new Staff(per2.name,per2.address,"Dawei University",150000.0);
		System.out.println("Student Information:");
		System.out.println("Name: "+stud.name+"\nAddress: "+stud.address+"\nProgram: "+stud.program+"\nYear: "+ stud.year+ "\nFee: "+stud.fee);
		System.out.println();
		System.out.println("Staff Information:");
		System.out.println("Name: "+st.name+"\nAddress: "+st.address+"\nSchool: "+st.school+"\nPay: "+st.pay);
	}
	}
                               









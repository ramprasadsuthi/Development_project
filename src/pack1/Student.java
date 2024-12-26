package pack1;

public class Student {
	
	int id;
	String name;
	int age;
	
	public void getStudentDetails() {
		System.out.println("Student ID : " + id);
		System.out.println("Student Name : " + name);
		System.out.println("Student Age : " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st = new Student();
		
		st.id = 101;
		st.name = "Bhargav";
		st.age = 22;
		
		st.getStudentDetails();

	}

}

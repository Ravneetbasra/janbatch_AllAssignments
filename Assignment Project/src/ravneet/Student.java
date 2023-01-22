package ravneet;

public class Student {
	
	int age;
	int rollnumber;
	
	public void display1() {
		
		System.out.println("Welcome All of You!");
	}
	
	public void display2() {
		
		System.out.println("Automation is very Easy.");
		
	}

	public static void main(String[] args) {
		
		Student student = new Student();
		student.display1();
		student.display2();
		student.age = 25;
		student.rollnumber = 114;
		System.out.println(student.age);
		System.out.println(student.rollnumber);
		
		
		 
	}

}

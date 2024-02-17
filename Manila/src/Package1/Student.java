package Package1;

public class Student {
	int rollno , age;
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}

	public static void main(String[] args) {
		Student stu = new Student();
		stu.age = 30;
		System.out.println("age of student is"+ stu.age);
		stu.rollno = 11;
		System.out.println("rollno of student is"+ stu. rollno);
		
		stu.display1();
		stu.display2();
		
		
		
	}
}

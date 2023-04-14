//Create an abstract class "Person" with a non-abstract method "getFullName()".
//Implement two subclasses "Student" and "Teacher" which implement the "getFullName()" 
//method and also have their own attributes such as "studentId" and "teacherId".

abstract class Personn {
	String FirstName;
	String LastName;

	Personn(String FirstName, String LastName) {
		this.FirstName = FirstName;
		this.LastName = LastName;
	}

	void getFullName() {
		System.out.println("Full name of Person : " + FirstName + " " + LastName);
	}
}

class Student extends Personn {
	private int Sid;

	Student(String FirstName, String LastName, int Sid) {
		super(FirstName, LastName);
		this.Sid = Sid;
	}

	void getFullName() {
		System.out.println("Full name of Student : " + FirstName + " " + LastName);
	}


}

class Person {
	public static void main(String[] args) {
		Personn s = new Student("abc", "Student", 1);
		Personn t = new Teacher("pqr", "teacher", 1);
		s.getFullName();
		t.getFullName();
	}
}
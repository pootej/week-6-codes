// Create an interface Employee with the following methods:public void
// calculateSalary();
// public void displayEmployeeDetails();
// Create classes Manager, Developer, and Tester that implement this interface.
// Write a program that accepts the type of employee and their details
// (name, age, designation, salary) and calculates their salary based on their
// designation.
// Display the employee details and the calculated salary.

interface  Employee{
public void	calculateSalary();
public void	displayEmployeeDetails();
}
class Manager implements Employee{
	String name;
	int age;
	String designation;
	int salary;

	Manager(String name,int age,String designation,int salary){
		this.name=name;
		this.age=age;
		this.designation=designation;
		this.salary=salary;
	}
	String getName(){
		return name;
	}
	int getAge(){
		return age; 
	}
	String getDesignation(){
		return designation;
	}
	int getSalary(){
		return salary; 
	}
}

class Developer implements Employee{
	super(name,age,designation,salary);
}
class Tester implements Employee{
	super(name,age,designation,salary);
	
}
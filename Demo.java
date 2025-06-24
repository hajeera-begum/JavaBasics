// This is a simple Java program that defines an Employee class with three fields: id, name, and salary.
class Employee{
	
	int id;
	String name;
	double salary;
}

public class Demo {
	   public static void main(String[] args) {
		//here create object of Employee class and add 101,sam,1000 data into that
		//display that data here
		   Employee e=new Employee();
		   e.id=101;
		   e.name="sam";
		   e.salary=1000;
		   
		   System.out.println("ID: "+e.id);
		   System.out.println("Name: "+e.name);
		   System.out.println("Salary: "+e.salary);
	   }
	} 


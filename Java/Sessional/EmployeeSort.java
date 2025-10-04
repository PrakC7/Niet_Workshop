import java.util.Arrays;
class Employee {
	int id;
	String name;
	double salary;


	Employee(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void showDetails(){
		System.out.println("ID: "+id+", Name: "+name+", Salary: "+salary);
	}
}

public class EmployeeSort{
	public static void main(String a[]){
		Employee[] employees = {
			new Employee(1, "Employee1", 10000),
			new Employee(2, "Employee2", 20000),
			new Employee(3, "Employee3", 30000),
			new Employee(4, "Employee4", 40000),
			new Employee(5, "Employee5", 50000),                                                                                                                                                           
		};
	
		System.out.print("Before Sorting:\n");
		for(Employee e : employees){
			e.showDetails();
		}

		Arrays.sort(employees,  (e1, e2) -> Double.compare(e2.salary, e1.salary));

		System.out.println("\nAfter Sorting by Salary in Descending order:");
		for(Employee e : employees){
			e.showDetails();
		}
	}
}

import java.util.*;
class Employee implements Comparable<Employee>
	{ String name;
	  int salary;
	  Employee(String name, int salary)
		{ this.name = name;
		  this.salary = salary;
		}
	
	  public int compareTo(Employee e)
		{ if (e.salary == salary)
		   return 0;
		    if(e.salary < salary)
		   return -1;
		   else 
		   return  1;
		}


}
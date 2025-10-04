import java.util.*;
class Comparator implements Comparable<Employee>
	{ String name;
	  int salary;
	  Employee(String name, int salary)
		{ this.name = name;
		  this.salary = salary;
		}
	
	  public int compare(Employee e1, Employee e2)
		{ if (e1.salary == e2.salary)
		   return 0;
		    if(e1.salary > e2.salary)
		   return 1;
		   else 
		   return  -1;
		}
	}
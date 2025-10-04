import java.util.*;
class EmpArrayComparator
	{ public static void main(String args[])
		{ ArrayList<Employee> el = new ArrayList<Employee>(); 
		  el.add(new Employee("Aala", 50000));
		  el.add(new Employee("Bala", 10000));
		  el.add(new Employee("Kala", 50000));
		  Collections.sort(el, new Employee("Ram", 50000));
		  Iterator i = el.iterator();
		  while(i.hasNext())
			{ Employee e =(Employee)i.next();
			  System.out.println(e.name+" - "+e.salary);
			}
		}
	}
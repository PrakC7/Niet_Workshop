import java.util.*;
class EmpHashSet
	{ public static void main(String args[])
		{ HashSet<Employee> el = new HashSet<Employee>(); 

		  Employee e3 = new Employee("Bala", 50000);
		  Employee e2= new Employee("Aala", 10000);
		  Employee e1= new Employee("Kala", 20000);

		  el.add(e1);
		  el.add(e2);
		  el.add(e3);
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
		  Iterator i = el.iterator();
		  while(i.hasNext())
			{ Employee e4 =(Employee)i.next();
			  System.out.println(e4);
			}
		}
	}
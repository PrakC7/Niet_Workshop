import java.util.*;
class EmpLinkedList
	{ public static void main(String args[])
		{ LinkedList<Employee> el = new LinkedList<Employee>(); 
		  el.add(new Employee("Aala", 50000));
		  el.add(new Employee("Bala", 10000));
		  el.add(new Employee("Kala", 50000));
		  Collections.sort(el);
		  Iterator i = el.iterator();
		  while(i.hasNext())
			{ Employee e =(Employee)i.next();
			  System.out.println(e.name+" - "+e.salary);
			}
		}
	}
import java.util.*;
class EmpTreeSet
	{ public static void main(String args[])
		{ TreeSet<String> el = new TreeSet<String>(); 

		  el.add("Aala");
		  el.add("Kala");
		  el.add("Bala");
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
		  Iterator i = el.iterator();
		  while(i.hasNext())
			{ String e4 =(String)i.next();
			  System.out.println(e4);
			}
		}
	}
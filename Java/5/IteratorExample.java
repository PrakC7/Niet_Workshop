import java.util.*;
public class IteratorExample
	{ public static void main(String a[])
		{ ArrayList<String> l = new ArrayList<String>();
			l.add("K");
			l.add("B");
			l.add("C");
			System.out.println("Before sorting");
			for(i = 0;
			Iterator i = l.iterator();
			while(i.hasNext())
			{ String s = (String) i.next();
			System.out.print(s);
			}
		}
	}
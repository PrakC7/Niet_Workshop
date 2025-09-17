class Child extends Parent
{
	
	Child()
	{super(10);
		System.out.println("in child Constructor");
		}
		Child(String s,int n)
		{
			super(n);
			System.out.println(s+n);
		}
String n="Child";
void show()
{
System.out.println("in show ");

}
public static void main(String a[])
{
Child c=new Child("Sec B",100);
c.display();
c.show();
System.out.println(c.i);
System.out.println(c.n);

}
}
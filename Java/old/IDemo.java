public class IDemo implements Demo
{
public void sum()
{
int i = Demo. A +Demo.B;
System.out.println(i);
public void sub()
int i = Demo.A - Demo.B;
public int mult()
{
return(Demo.A*Demo.B);
}
public static void main(String args[])
{
IDemo ID = new IDemo();
ID.sum();
ID.sub();
System.out.println(ID.mult());
}
}
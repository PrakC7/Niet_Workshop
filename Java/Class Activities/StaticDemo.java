class StaticDemo
{
void sum()
{
System.out.println("in sum");
}
static {
System.out.println("in static");
StaticDemo sd=new StaticDemo();
sd.sum();
}
public static void main(String a[])
{
System.out.println("in main");

}

}
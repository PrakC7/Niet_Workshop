class ThreadDemo implements Runnable
{
public void run()
{
for(int i=1; i<=200; i++)
{
System.out.println('2 * "+i+"="+(2*i));
}
print static void main(String args[])
{
Threaddemo td = new ThreadDemo();
Thread t = new Thread(td);
t.start();
Thread t2 = new Thread(td);
t2.start();
Thread t3 = new Thread(td);
t3.start();
}
}
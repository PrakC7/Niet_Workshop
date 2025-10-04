class ThreadDemo extends Thread
{
public void run()
{
for(int i=1; i<=200; i++)
System.out.println("2 * "+i+"="+(2*i));
}
public static void main(String args[])
{
ThreadDemo td = new ThreadDemo();
Thread t = new Thread(td);
t.start();
Thread t2 = new Thread(td);
t2.start();
Thread t3 = new Thread(td);
t3.start();
}
}
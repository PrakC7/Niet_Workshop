class ThreadDemo4 extends Thread
{
public void run()
{
        for (int i = 1; i <= 200; i++)
            System.out.println(5 * i);
    }

    public static void main(String[] args) {
        ThreadDemo4 t = new ThreadDemo4();               
        t.start();    
        ThreadDemo2 t2 = new ThreadDemo2();               
        t2.start();   
        ThreadDemo t3 = new ThreadDemo();               
        t3.start();   
}
}
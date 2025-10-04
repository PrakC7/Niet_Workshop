class ThreadDemo2 extends Thread {
    public void run() {
        for (int i = 1; i <= 200; i++)
            System.out.println("5 * " + i + " = " + (5 * i));
    }

    public static void main(String[] args) {
        ThreadDemo2 td1 = new ThreadDemo2();      
        Thread t1 = new Thread(td1);               
        t1.start();                               

        ThreadDemo2 td2 = new ThreadDemo2();      
        Thread t2 = new Thread(td2);               
        t2.start();                   

        ThreadDemo2 td3 = new ThreadDemo2();      
        Thread t3 = new Thread(td3);               
        t3.start();              
    }
}

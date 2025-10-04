public class MainDemo {
    public static void main(String[] args) {
        Student student = new Student();

        Thread t1 = new Thread(new First(student));
        Thread t2 = new Thread(new Second(student));

        t1.start();

        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        t2.start();
    }
}

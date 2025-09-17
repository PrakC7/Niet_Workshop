class Demo {
    protected void finalize() {
        System.out.println("Finalize method called");
    }
}
public class Main19 {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj = null;
        System.gc();
        System.out.println("Main method completed");
    }
}
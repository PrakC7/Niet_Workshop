class Outer {
    static class Inner {
        void display() {
            System.out.println("Inside static nested class");
        }
    }
}
public class Main15 {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.display();
    }
}
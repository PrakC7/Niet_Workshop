class Outer {
    interface Inner {
        void show();
    }
}
class Example implements Outer.Inner {
    public void show() {
        System.out.println("Nested interface inside class");
    }
}
public class Main21 {
    public static void main(String[] args) {
        Outer.Inner obj = new Example();
        obj.show();
    }
}
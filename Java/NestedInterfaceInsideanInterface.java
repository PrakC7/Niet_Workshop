interface OuterInterface {
    void outerMethod();
    interface InnerInterface {
        void innerMethod();
    }
}
class Test implements OuterInterface.InnerInterface {
    public void innerMethod() {
        System.out.println("Inner interface method");
    }
}
public class Main20 {
    public static void main(String[] args) {
        OuterInterface.InnerInterface obj = new Test();
        obj.innerMethod();
    }
}
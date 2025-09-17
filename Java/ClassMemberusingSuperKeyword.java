class Parent {
    int num = 100;
    void display() {
        System.out.println("Parent class method");
    }
}
class Child extends Parent {
    int num = 200;
    void display() {
        super.display();
        System.out.println("Parent num: " + super.num);
    }
}
public class Main16 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
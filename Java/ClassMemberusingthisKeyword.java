class Sample {
    int num;
    Sample(int num) {
        this.num = num;
    }
    void display() {
        System.out.println("Number: " + this.num);
    }
}
public class Main17 {
    public static void main(String[] args) {
        Sample obj = new Sample(50);
        obj.display();
    }
}
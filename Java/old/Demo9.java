class Demo9 implements Runnable{
	synchronized public void run(){
		for(int i = 1; i <=20; i++){
			System.out.println(5*i);
		}
	}
public static void main(String a[]){
	System.out.println("in Run Method");
	Demo9 d = new Demo9();
	Thread t = new Thread(d);
	t.start(); 
	Thread t2 = new Thread(d);
	t2.start(); 
	t.setName("First");
	}
}
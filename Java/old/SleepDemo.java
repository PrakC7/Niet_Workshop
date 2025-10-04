class SleepDemo implements Runnable{
	public void run(){
		for(int i = 1; i <=200; i++){
			System.out.println("In Runnable");
			try{
				Thread.sleep(300);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
public static void main(String a[]){
	System.out.println("in Run Method");
	SleepDemo s = new SleepDemo();
	Thread t = new Thread(s);
	t.start(); 
	t.setName("First");
	}
}
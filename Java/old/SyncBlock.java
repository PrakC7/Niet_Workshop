class SyncBlock implements Runnable{
	public void table(){
		System.out.println("Hello");
		synchronized(this){
			for(int i = 1; i <=20; i++){
				System.out.println(5*i);
			try{
				Thread.sleep(100);
			}
			catch(Exception e){}
			}
		}
	}
public void run(){
	table();
}
public static void main(String a[]){
	SyncBlock s = new SyncBlock(); 
	Thread t = new Thread(s);
	t.start();
	SyncBlock s2 = new SyncBlock();
	Thread t2 = new Thread(s2);
	t2.start();
}
}
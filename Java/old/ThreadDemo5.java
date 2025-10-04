class ThreadDemo5{
	public static void main(String[] args){
		Demo d = new Demo();
		Thread t = new Thread(d);
		t.start();
	}
}

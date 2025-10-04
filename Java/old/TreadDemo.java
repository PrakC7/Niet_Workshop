class ThreadDemo{
	public static void main(String[] args){
		Demo d = new Demo();
		Thread t = new Thread(d);
		t.Start();
	}
}

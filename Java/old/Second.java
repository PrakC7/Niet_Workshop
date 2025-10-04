class Second implements Runnable {
	Student s;
	Second(Student s) { 
		this.s = s;
	}
public void run() {
	s.deposit(100000);
	}
}
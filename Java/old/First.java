class First implements Runnable {
	Student s;
	First(Student s) { 
		this.s = s; 
	}
public void run() {
	s.withdraw(100000);
	}
}
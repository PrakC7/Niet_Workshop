class Student {
    int amount = 50000;

    synchronized void withdraw(int amt) {
        System.out.println("in withdraw");
        try {
            if (this.amount < amt) {
                System.out.println("less amount to withdraw");
                wait();
            }
        } catch (Exception e) {
            System.out.println("Thread interrupted");
        }
        this.amount = this.amount - amt;
        System.out.println("amount withdrawn \nBal = " + this.amount);
    }

    synchronized void deposit(int amt) {
        System.out.println("amount deposited");
        this.amount = this.amount + amt;
        System.out.println("amount deposited \nBal = " + this.amount);
        notify();
    }
}



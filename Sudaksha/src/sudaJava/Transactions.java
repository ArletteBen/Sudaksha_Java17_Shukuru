package sudaJava;

public class Transactions {
int balance=5000;
synchronized void withdraw(int amount) {
	System.out.println("Available balance= "+this.balance);
	System.out.println("Trying to withdraw= "+amount);
	if(this.balance<amount) {
		System.out.println("Less balance; waiting for deposit...");	
		try {
			Thread.sleep(6000);
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	this.balance-=amount;
	System.out.println("Withdraw completed...balance is:"+this.balance);	
}
synchronized void deposit(int amount) {
	System.out.println("Trying to deposit..."+amount);	
	this.balance+=amount;
	System.out.println("Deposit completed...balance is: "+this.balance);	
	notify();
}
}

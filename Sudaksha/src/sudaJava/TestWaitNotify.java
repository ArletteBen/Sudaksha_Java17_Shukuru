package sudaJava;

public class TestWaitNotify {

	public static void main(String[] args) {
		Transactions tran=new Transactions();
		// using lambda
		Runnable r1=()->{
			tran.withdraw(8000);
		};
		Runnable r2=()->{
			tran.deposit(5000);
		};
		Thread withdraw=new Thread(r1);
		Thread deposit=new Thread(r2);
		withdraw.start();
		deposit.start();
	}

}

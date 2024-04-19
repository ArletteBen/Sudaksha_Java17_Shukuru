package sudaJava;

public sealed class Account  permits Savings, Current{
protected int acno;
protected double balance;
public int getAcno() {
	return acno;
}
public double getBalance() {
	return balance;
}
public void setAcno(int acno) {
	this.acno = acno;
}
public void setBalance(double balance) {
	this.balance = balance;
}

}

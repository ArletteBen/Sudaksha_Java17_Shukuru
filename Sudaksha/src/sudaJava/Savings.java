package sudaJava;

public non-sealed class Savings extends Account{
private double interestRate;

	public double getInterestRate() {
	return interestRate;
}

public void setInterestRate(double interestRate) {
	this.interestRate = interestRate;
}

	public static void main(String[] args) {
		Savings sav=new Savings();
sav.setAcno(1001);
sav.setBalance(5000);
sav.setInterestRate(7.5);
System.out.println(sav.acno+" "+sav.balance+" "+sav.getInterestRate());
	}

}

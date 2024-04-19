package sudaJava;

public non-sealed class Current extends Account{
private double overDraftLimit;

public double getOverDraftLimit() {
	return overDraftLimit;
}

public void setOverDraftLimit(double overDraftLimit) {
	this.overDraftLimit = overDraftLimit;
}
public static void main(String[] args) {
	Current cur=new Current();
	cur.setAcno(50001);
	cur.setBalance(25000);
	cur.setOverDraftLimit(200000);
	System.out.println(cur.getAcno()+" "+cur.getBalance()+" "+cur.getOverDraftLimit());
}
}

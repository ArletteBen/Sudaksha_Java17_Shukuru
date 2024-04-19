package sudaJava;

import java.io.Serializable;

public class CardInfo implements Serializable {
private int cardNumber;
private int month;
private int year;
private int cvv;
private String name;
public CardInfo() {
	
}
public CardInfo(int cardNumber, int month, int year, int cvv, String name) {
	this.cardNumber = cardNumber;
	this.month = month;
	this.year = year;
	this.cvv = cvv;
	this.name = name;
}
public int getCardNumber() {
	return cardNumber;
}
public int getMonth() {
	return month;
}
public int getYear() {
	return year;
}
public int getCvv() {
	return cvv;
}
public String getName() {
	return name;
}
@Override
public String toString() {
	return "CardInfo [cardNumber=" + cardNumber + ", month=" + month + ", year=" + year + ", cvv=" + cvv + ", name="
			+ name + "]";
}


}

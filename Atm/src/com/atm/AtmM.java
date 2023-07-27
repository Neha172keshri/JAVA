package com.atm;

public class AtmM {
private double viewBalance;
private double depositAmount;
private double withdrawAmount;
public AtmM(double viewBalance, double depositAmount, double withdrawAmount) {
	super();
	this.viewBalance = viewBalance;
	this.depositAmount = depositAmount;
	this.withdrawAmount = withdrawAmount;
}
public double getViewBalance() {
	return viewBalance;
}
public void setViewBalance(double viewBalance) {
	this.viewBalance = viewBalance;
}
public double getDepositAmount() {
	return depositAmount;
}
public void setDepositAmount(double depositAmount) {
	this.depositAmount = depositAmount;
}
public double getWithdrawAmount() {
	return withdrawAmount;
}
public void setWithdrawAmount(double withdrawAmount) {
	this.withdrawAmount = withdrawAmount;
}
public AtmM() {
	super();
	// TODO Auto-generated constructor stub
}
public String toString() {
	return "AtmM [viewBalance=" + viewBalance + ", depositAmount=" + depositAmount + ", withdrawAmount="
			+ withdrawAmount + "]";
}

}

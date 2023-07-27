package com.atm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AtmoperationImpl  implements AtmoperationInterface{
	AtmM at=new AtmM();
	Map<Double,String> ministatement=new HashMap<Double,String>();

	public void viewBalance() {
		System.out.println("Balance is: "+ at.getViewBalance());
		
	}

	public void depositAmount(double depositAmount) {
		ministatement.put(depositAmount, "Amount deposited");
		System.out.println("Deposited sucessfully!! :"+depositAmount);
		at.setViewBalance(at.getViewBalance()+depositAmount);
		viewBalance();
	}

	public void withdrawAmount(double withdrawAmount) {
		if(at.getViewBalance()>=withdrawAmount) {ministatement.put(withdrawAmount, "Amount withdrawn");
			at.setViewBalance(at.getViewBalance()-withdrawAmount);
			System.out.println();
		System.out.println("Balance available :");
		viewBalance();}
		
	}

	public void viewministatement() {
	for(Map.Entry<Double, String>m:ministatement.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());}
		
	}

}

package com.tns.framework;
public abstract class CurrentAcc extends BankAcc {
	private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
	}
	public void withdraw(float accBal) {
	
		System.out.println("Account no is "+this.getAccNo()+"   Account Name is   "+this.getAccNm()+ "  "+"accBal is "+  (accBal+creditLimit));
	}
	@Override
	public String toString() {
		return String.format("NormalAcc [deliveryCharges=%s, toString()=%s]",
				creditLimit, super.toString());
	}
	
	

}










/*public abstract class CurrentAcc extends BankAcc
{
	private static float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		CurrentAcc.creditLimit=creditLimit;
	}
	public static float creditLimit() {
		return creditLimit;
	}
	@Override
	public String toString() {
		return String.format("CurrentAcc [toString()=%s, getClass()=%s, hashCode()=%s]", super.toString(), getClass(),
				hashCode());
	}
	

}*/

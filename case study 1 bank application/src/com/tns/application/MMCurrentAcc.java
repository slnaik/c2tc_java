package com.tns.application;

import com.tns.framework.CurrentAcc;

/*public class MMCurrentAcc extends CurrentAcc
{
	

	public MMCurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		
	}
	public void withdraw(float limit)
	{
		float limi1=limit+CurrentAcc.creditLimit();
		System.out.println("Account No: "+CurrentAcc.getAccNo()+"\n"+"Account name:"+CurrentAcc.getAccNm()+"\n"+"charges:"+CurrentAcc.creditLimit()+"\n"+"credit Limit:"+CurrentAcc.creditLimit());
	}
	public void  deposite(float deposite_id)
	{
		System.out.println();
	}
	@Override
	public String toString() {
		return String.format("MMCurrentAcc [toString()=%s, getClass()=%s, hashCode()=%s]", super.toString(), getClass(),
				hashCode());
	}*/
public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return String.format("GSNormalAcc [toString()=%s]", super.toString());
	}
	
	
	

}
	



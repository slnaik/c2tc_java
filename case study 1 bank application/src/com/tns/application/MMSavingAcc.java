package com.tns.application;

import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

/*public class MMSavingAcc extends SavingAcc
{
	private static final float MINBAL = 0.0f;

	public MMSavingAcc(int accNo, String accNm, float accBal) 
	{
		super(accNo, accNm, accBal);
		
		
	}

	public void withdraw(float limit) {
		System.out.println("Account No: "+SavingAcc.getAccNo()+"\n"+"Account name:"+SavingAcc.getAccNm()+"\n"+"accBal:"+SavingAcc.getAccBal()+"\n"+"credit Limit:"+SavingAcc.getcreditLimit());
	}

	@Override
	public String toString() {
		return String.format("MMSavingAcc [toString()=%s, getClass()=%s, hashCode()=%s]", super.toString(), getClass(),
				hashCode());
	}
	

}*/
public class MMSavingAcc extends SavingAcc{
	

	public MMSavingAcc(int accNo, String accNm, float accBal, float isSalary) {
		super(accNo, accNm,accBal, isSalary);
		
		
	}
	
	@Override
	public String toString() {
		return String.format("MMSavingAcc [toString()=%s]", super.toString());
	}
	
	

}

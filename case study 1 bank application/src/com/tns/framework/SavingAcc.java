package com.tns.framework;
public abstract class SavingAcc extends BankAcc {
	private float isSalary;
	static final private float deliveryCharges=0.0f;
	public SavingAcc(int accNo, String accNm, float accBal,float isSalary) {
		super(accNo, accNm, accBal);
        this.isSalary=isSalary;
	}
	public void withdraw(float accBal) {
		System.out.println("Account no is "+this.getAccNo()+"   Account name is   "+this.getAccNm()+ "  "+"accBal is "+accBal);
		
	}
	@Override
	public String toString() {
		return String.format("SavingAcc [isSalary=%s, toString()=%s]", isSalary,
				super.toString());
	}
	
	
	

}





/*public abstract class SavingAcc extends BankAcc
{
	private	static boolean isSalary;
	private static final float creditLimit=0.0f;
	

	public SavingAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		//this.isSalary=isSalary;
		SavingAcc.isSalary = isSalary;
	}


	public static boolean getisSalary() 
	{
		return isSalary;
	}
	public static float getcreditLimit() {
		return creditLimit;
	}

	
	

}*/

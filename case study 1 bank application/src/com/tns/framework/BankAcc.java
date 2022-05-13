package com.tns.framework;

public abstract class BankAcc 
{
	private static int accNo;
	private static String accNm;
	private static float accBal;
	
	public BankAcc(int accNo, String accNm, float accBal)
	{
		
		BankAcc.accNo = accNo;
		BankAcc.accNm = accNm;
		BankAcc.accBal = accBal;
	}

	public static int getAccNo() {
		return accNo;
	}

	
	public static String getAccNm() {
		return accNm;
	}

	public static void setAccNm(String accNm) {
		BankAcc.accNm = accNm;
	}

	public static float getAccBal() {
		return accBal;
	}

	public static void setAccBal(float accBal) {
		BankAcc.accBal = accBal;
	}

	@Override
	public String toString() {
		return String.format("BankAcc [accNo=%s, accNm=%s, charges=%s]", accNo, accNm, accBal);
	}
	
	
	

}

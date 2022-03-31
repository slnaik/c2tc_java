package com.tns.packages3;
import com.tns.packages2.SBI;

public class Encapsulation 
{
	public static void main(String[] args) 
	{
		SBI s=new SBI();
		s.setBalance(2500000);
		System.out.println("your SB a/c Balance:"+s.getBalance());

	}

}

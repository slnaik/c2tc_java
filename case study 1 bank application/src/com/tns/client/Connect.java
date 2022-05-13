package com.tns.client;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class Connect {

	public static void main(String[] args) 
	{
		
		BankFactory s=new MMBankFactory();
		SavingAcc p=new MMSavingAcc(102,"shankar",5000.0f,50.0f);
		CurrentAcc n=new MMCurrentAcc(109,"ram",300.0f,100.0f);
		System.out.println("saving Account:");
		p.withdraw(350);
		System.out.println();
		System.out.println("current Account:");
		n.withdraw(400.0f);
		System.out.println(p);
		System.out.println();
		System.out.println(n);
		System.out.println();
		
	}

}

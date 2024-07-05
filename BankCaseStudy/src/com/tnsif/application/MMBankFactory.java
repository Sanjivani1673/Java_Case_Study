package com.tnsif.application;

import com.tnsif.framework.Bankfactory;
import com.tnsif.framework.CurrentAcc;
import com.tnsif.framework.SavingAcc;

public class MMBankFactory extends Bankfactory {

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		SavingAcc savingacc = new MMSavingAcc(accNo, accNm, accBal, isSalary);
		return savingacc;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		CurrentAcc currentacc = new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return currentacc;
	}

	
}

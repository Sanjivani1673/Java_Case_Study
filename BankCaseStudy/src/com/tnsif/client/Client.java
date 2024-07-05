package com.tnsif.client;

import com.tnsif.application.*;
import com.tnsif.framework.*;

public class Client {

	public static void main(String[] args) {
		
		
		SavingAcc sa = new MMSavingAcc(515456774, "Sanjivani", 100000000, false);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		
		
		CurrentAcc ca = new MMCurrentAcc(534534678, "Chaitanya", 20000000, 100000);
		ca.withdraw(ca.getCreditLimit());
		ca.toString();
		
				
	}
}

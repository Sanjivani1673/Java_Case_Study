package com.shopping.application;

import com.shopping.framework.*;

public class GSPrimeAcc extends PrimeAcc {
	
	
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		
	}

	@Override
	public void bookProduct(float Charges) {
		super.bookProduct(getCharges());
		System.out.println("Cogratulations!....");
		System.out.println("Product booked with no Delivery Charges:" + getCharges());
	}

	@Override
	public String toString() {
		return "GSPrimeAcc []";
	}

	

	

	

	
	
	
	

}

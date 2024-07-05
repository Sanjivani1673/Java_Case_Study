package com.shopping.application;

import com.shopping.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		
	}

	

	@Override
	public void bookProduct(float charges) {
		
		super.bookProduct(charges);
		System.out.println("Delivery Charges for your booked product:" + getDeliveryCharges());
	}



	@Override
	public String toString() {
		return "GSNormalAcc []";
	}

	

	

}

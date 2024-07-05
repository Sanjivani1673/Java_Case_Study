package com.shopping.framework;

public abstract class NormalAcc extends ShopAcc{
	
	private final float deliveryCharges;
	
	
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		this.deliveryCharges = deliveryCharges;
	}


	@Override
	public void bookProduct(float charges) {
		
		super.bookProduct(charges);
		System.out.println("Delivery Charges for your booked product:" + getDeliveryCharges());
	}


	


	public float getDeliveryCharges() {
		return deliveryCharges;
	}


	
	}
	



package com.shopping.framework;

public abstract class PrimeAcc extends ShopAcc{
	private boolean isPrime;
	private static final float deliveryCharges = 0;
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime ) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
		
	}

	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}

	public static float getDeliverycharges() {
		return deliveryCharges;
	}
	 @Override
	public void bookProduct(float charges) {
		
		super.bookProduct(charges);
	
		System.out.println("Booked product with no Delivery Charges");
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}
	

}

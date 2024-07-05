package com.shopping.application;

public class GSShopFactory {
	
	public GSPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {

		GSPrimeAcc primeacc = (GSPrimeAcc) new GSPrimeAcc(accNo, accNm, charges, isPrime);
		return primeacc;
	}

	public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		
		GSNormalAcc normalacc = (GSNormalAcc) new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
		return normalacc;
	}
}

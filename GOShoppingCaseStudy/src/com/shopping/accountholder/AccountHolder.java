package com.shopping.accountholder;

import com.shopping.application.*;

import com.shopping.framework.*;

public class AccountHolder {

	public static void main(String[] args) {

		
		PrimeAcc primeacc = new GSPrimeAcc(579, "Sanjivani", 5000.0f, true);
		primeacc.bookProduct(100.0f);
		primeacc.toString();
		
		
		
		
		NormalAcc normalacc = new GSNormalAcc(246, "Shankar", 500.0f, 30.0f);
		normalacc.bookProduct(500.0f);
		normalacc.toString();
		
		
		

	

}
}

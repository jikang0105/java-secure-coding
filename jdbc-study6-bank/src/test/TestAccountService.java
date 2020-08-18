package test;

import model.AccountController;

public class TestAccountService {
	
	
	public static void main(String[] args) {
		AccountController ac = new AccountController();
		
		// °èÁÂ°³¼³
		
		/*
		 * ac.AccountInsert("°­ÀÏ", "1231", 1000); ac.AccountInsert("°­ÀÌ", "1232", 2000);
		 * ac.AccountInsert("°­»ï", "1233", 3000); ac.AccountInsert("°­»ç", "1234", 4000);
		 * ac.AccountInsert("°­¿À", "1235", 5000); ac.AccountInsert("°­À°", "1236", 6000);
		 * ac.AccountInsert("°­Ä¥", "1234", 700);
		 */
		
		ac.Minus(15, "1233", -500);
		ac.Minus(15, "1233", 500);
		ac.Minus(15, "1233", -500);
		
		
		
			
		 
	}
}

package test;

import model.AccountController;

public class TestAccountService {
	
	
	public static void main(String[] args) {
		AccountController ac = new AccountController();
		
		// ���°���
		
		/*
		 * ac.AccountInsert("����", "1231", 1000); ac.AccountInsert("����", "1232", 2000);
		 * ac.AccountInsert("����", "1233", 3000); ac.AccountInsert("����", "1234", 4000);
		 * ac.AccountInsert("����", "1235", 5000); ac.AccountInsert("����", "1236", 6000);
		 * ac.AccountInsert("��ĥ", "1234", 700);
		 */
		
		ac.Minus(15, "1233", -500);
		ac.Minus(15, "1233", 500);
		ac.Minus(15, "1233", -500);
		
		
		
			
		 
	}
}

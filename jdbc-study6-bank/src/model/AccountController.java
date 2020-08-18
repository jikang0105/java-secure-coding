package model;

import java.sql.SQLException;

import exception.AccountException;
import exception.BlanceException;
import exception.PasswordException;

public class AccountController {
	private AccountDAO dao = new AccountDAO();
	
	public void AccountInsert(String userName, String userPass, int blance) {
		try {
			dao.AccountInsert(userName, userPass, blance);
			System.out.println("°èÁÂ°³¼³ ¼º°ø");
		} catch (SQLException | BlanceException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void BlanceCheck(int accountNum, String userPass) {
		try {
			AccountVO vo;
			vo = dao.BlanceCheck(accountNum, userPass);
			System.out.print(vo);
			System.out.println(" ÀÜ¾× : " + vo.getBalance());
		} catch (SQLException | AccountException | PasswordException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void Plus(int accountNum, String userPass, int blance) {
		try {
			AccountVO vo;
			vo = dao.Plus(accountNum, userPass, blance);
			System.out.print(vo);
			System.out.println(" ÀÜ¾× : " + vo.getBalance());
		} catch (SQLException | AccountException | PasswordException e) {
			System.out.println(e.getMessage());
		} catch (BlanceException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void Minus(int accountNum, String userPass, int blance) {
		AccountVO vo;
		try {
			vo = dao.Minus(accountNum, userPass, blance);
			System.out.print(vo);
			System.out.println(" ÀÜ¾× : " + vo.getBalance());
		} catch (SQLException | AccountException | PasswordException e) {
			System.out.println(e.getMessage());
		} catch (BlanceException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void Transfer(int accountNum1, int accountNum2, String userPass, int blance) {
		try {
			dao.AccountCheck(accountNum2);
			AccountVO vo = dao.Minus(accountNum1, userPass, blance);
			System.out.print(vo);
			System.out.println(" ÀÜ¾× : " + vo.getBalance());
			dao.Plus(accountNum2, blance);
		} catch (SQLException | AccountException e) {
			System.out.println(e.getMessage());
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		} catch (BlanceException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}

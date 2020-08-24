package test;

import java.sql.SQLException;

import model.AccountDAO;
import model.NotMatchedPasswordException;
import model.AccountNotFoundException;
import model.InsufficientBalanceException;
import model.NoMoneyException;
//step5 ������ü �׽�Ʈ 
public class TestUnit5 {
	public static void main(String[] args) {		
			try {
				AccountDAO dao = new AccountDAO();
				dao.transfer("1","1234","2",100);
				System.out.println("��ü �Ϸ�");			
			} catch (NoMoneyException e) {
				System.out.println(e.getMessage());
			}  catch (AccountNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (InsufficientBalanceException e) {
				System.out.println(e.getMessage());
			} catch (NotMatchedPasswordException e) {
				System.out.println(e.getMessage());
			}catch (ClassNotFoundException e) {				
				e.printStackTrace();			
			}catch (SQLException e) {				
				e.printStackTrace();
			}
	}
}
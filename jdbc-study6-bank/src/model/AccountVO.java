package model;

public class AccountVO {
	private int accountNum;
	private String userName;
	private String userPass;
	private int balance;
	public AccountVO() {
		super();
	}
	public AccountVO(int accountNum) {
		super();
		this.accountNum = accountNum;
	}
	public AccountVO(int accountNum, String userPass) {
		super();
		this.accountNum = accountNum;
		this.userPass = userPass;
	}
	public AccountVO(int accountNum, String userPass, int balance) {
		super();
		this.accountNum = accountNum;
		this.userPass = userPass;
		this.balance = balance;
	}
	public AccountVO(int accountNum, String userName, String userPass, int balance) {
		super();
		this.accountNum = accountNum;
		this.userName = userName;
		this.userPass = userPass;
		this.balance = balance;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "AccountVO [accountNum=" + accountNum + ", userName=" + userName + ", userPass=" + userPass
				+ ", balance=" + balance + "]";
	}
	
	
}

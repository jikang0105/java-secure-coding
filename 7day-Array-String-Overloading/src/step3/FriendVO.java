package step3;

public class FriendVO {
	private String name;
	private String nick;
	private int age;
	private String address;
	
	public FriendVO(String name, String nick, int age, String address) {
		super();
		this.name = name;
		this.nick = nick;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}

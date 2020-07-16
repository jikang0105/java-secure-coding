package step3;

public class FriendService {
	public void findNamesByAge(FriendVO[] f, int age) {
		for(int i = 0; i < f.length; i++) {
			if(f[i].getAge() >= age) {
				System.out.println(f[i].getName() + " " + f[i].getNick() + " " + f[i].getAge());
			}
		}
		
	}
	
	public void findNickByAddress(FriendVO[] f, String address) {
		for(int i = 0; i < f.length; i++) {
			if(f[i].getAddress().equals(address)) {
				System.out.println(f[i].getNick() + " " + f[i].getName() + " " + f[i].getAge());
			}
		}
	}
	
	public void findNameByFristName(FriendVO[] f, String firstName) {
		for(int i = 0; i < f.length; i++) {
			if(f[i].getName().startsWith("°­")) {
				System.out.println(f[i].getName() + " " + f[i].getAge() + " " + f[i].getNick());
			}
		}
	}
}

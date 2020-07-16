package step6;
// 생성자 오버로딩 테스트
// VO : Value Object
class MemberVO{
	private String id;			// 필수 입력 항목
	private String password;	// 필수 입력 항목
	private String hobby; 		// 선택 입력 항목
	
	public MemberVO(String id, String password) {
		this.id = id;
		this.password = password;
	}
	// 생성자 오버로딩 -> 다양한 매개변수를 입력받기 위해 생성자를 여러개 정의한다.
	public MemberVO(String id, String password, String hobby) {
		this.id = id;
		this.password = password;
		this.hobby = hobby;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
}
public class TestOverloading2 {
	public static void main(String[] args) {
		MemberVO vo1 = new MemberVO("java", "1234");
		System.out.println(vo1.getId() + " " + vo1.getPassword()
		+ " " + vo1.getHobby());
		MemberVO vo2 = new MemberVO("spring", "mybatis", "운동");
		System.out.println(vo2.getId() + " " + vo2.getPassword()
		+ " " + vo2.getHobby());
	}
}

package step3;
class InformationException extends Exception{
	public InformationException(String message) {
		super(message);
	}
}

class MemberDAO{
	public void registerInfo(String info) throws InformationException {
		if(info==null)
			throw new InformationException("null이므로 db에 insert 불가");
		if(info.equals(""))
			throw new InformationException("공란이므로 db에 insert 불가");
		System.out.println(info+" database에 insert");
	}
}

public class TestThrows3 {
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		try {
			//dao.registerInfo("");
			dao.registerInfo(null);
		} catch (InformationException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 정상수행");
	}
}

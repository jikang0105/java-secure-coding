package step5;

import java.util.Random;
import java.util.TreeSet;

class LottoService{
	// 1 ~ 45 까지 중복되지 않은 임의의 수 6개를 TreeSet에 담아 반환한다.
	public TreeSet<Integer> createLottoNumber() {
		TreeSet<Integer> set = new TreeSet<Integer>();
		Random r = new Random();
		while(set.size() < 6) {
			set.add(r.nextInt(45) + 1);
		}
		return set;
	}
	
}
public class TestLotto {
	public static void main(String[] args) {
		LottoService service = new LottoService();
		TreeSet<Integer> set = service.createLottoNumber();
		System.out.println("이번주 로또번호 : " + set);
	}
}

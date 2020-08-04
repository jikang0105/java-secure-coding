package school.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;

import school.exception.DuplicateTelException;
import school.exception.PersonNotFoundException;

public class SchoolService {
	private LinkedHashMap<String, Person> map;
	/**
	 *  지정한 경로 PathInfo LIST_PATH에 저장된 리스트 정보를 
	 *  객체 역직렬화하여 map에 로드하는 메서드
	 *  	1. 지정한 경로에 파일이 존재하는지 유무를 확인한다.
	 *  	2. 존재하지 않으면 구성원 정보를 저장할 map를 만든다
	 *  	3. 존재하면 FileInputStream과 ObjectInputStream을 이용해
	 *  	  객체를 역직렬화하여 map에 저장한다.
	 *  	4. 발생하는 Exception은 호출한 UI쪽으로 처리를 위임한다(던진다).
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	@SuppressWarnings("unchecked")
	public void loadList() throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File(PathInfo.LIST_PATH);
		if(file.exists()&&file.isFile()) { // 존재하면 역직렬화
			ObjectInputStream ois = null;
			try {
			ois = new ObjectInputStream(new FileInputStream(file));
			map = (LinkedHashMap<String, Person>) ois.readObject();
			} finally {
				if(ois!=null)
				ois.close();
			}
		} else { // 존재하지 않으면 처음 실행이므로 map를 생성
			map = new LinkedHashMap<String, Person>();
			
		}
	}
	/**
	 *  지정한 경로에 프로그램 종료시 파일에 map을 직렬화하여 정보를 유지시키는 메서드
	 *  FIleOutputStream < ObjectOutputStream writeObject()
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public void saveList() throws FileNotFoundException, IOException {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(PathInfo.LIST_PATH));
			oos.writeObject(map);
		} finally {
			if(oos!=null)
			oos.close();
		}
	}
	
//tel이 중복되면 추가하지 않고 DuplicateTelException을 발생시키고 호출한 곳으로 던진다
	public void addPerson(Person person) throws DuplicateTelException {
		if (map.containsKey(person.getTel())) {
			throw new DuplicateTelException(person.getTel() + " tel이 존재하여 추가불가!");
		} else {
			
			map.put(person.getTel(), person);
		}
	}

	public void printAll() {
		Iterator<Person> it = map.values().iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

//tel에 해당하는 구성원이 없을 경우 PersonNotFoundException을 발생시키고
//호출한 곳으로 전달한다 
	public Person findPersonByTel(String tel) throws PersonNotFoundException {
		Person p = map.get(tel);
		if (p == null)
			throw new PersonNotFoundException(tel + " tel이 존재하지 않아 조회할 수 없습니다.!");
		return p;
	}

	public Person removePersonByTel(String tel) throws PersonNotFoundException {
		Person p = map.remove(tel);
		if (p == null)
			throw new PersonNotFoundException(tel + " tel이 존재하지 않아 삭제할 수 없습니다.! ");
		return p;
	}

	public void updatePerson(Person person) throws PersonNotFoundException {
		if (map.containsKey(person.getTel()) == false)
			throw new PersonNotFoundException(person.getTel() + " tel이 존재하지 않아 수정할 수 없습니다.! ");
		map.put(person.getTel(), person);
	}	
}

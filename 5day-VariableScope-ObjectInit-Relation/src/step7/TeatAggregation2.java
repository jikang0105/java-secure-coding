package step7;

public class TeatAggregation2 {
	public static void main(String[] arg) {
		// 아래코드가 실행되도록 대응하는 클래스들을 구현해본다.
		Student s = new Student("노을강상훈");
		System.out.println(s.getName());//노을강상훈
		s.setBook(new Book("백설공주","그림형제"));
		System.out.println(s.getBook().getTitle()); // 백설공주
		System.out.println(s.getBook().getAuthor());
	}
}

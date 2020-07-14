package step7;

public class Student {
	private String name;
	private Book book;
	
	public Student(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBook(Book book) {
		this.book = book;
	}
	
	public String getName() {
		return name;
	}
	
	public Book getBook() {
		return book;
	}
}

package model;
// DTO : Data Transfer Object
// VO : Value Object
public class GuestBookDTO {
	private int guestBookNo;
	private String title;
	private String content;
	public GuestBookDTO() {
		super();
	}
	public GuestBookDTO(String title, String content) {
		super();
		this.title = title;
		
		
		this.content = content;
	}
	public GuestBookDTO(int gestBookNo, String title, String content) {
		super();
		this.guestBookNo = gestBookNo;
		this.title = title;
		this.content = content;
	}
	public int getGuestBookNo() {
		return guestBookNo;
	}
	public void setGuestBookNo(int gestBookNo) {
		this.guestBookNo = gestBookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "GuestBookDTO [guestBookNo=" + guestBookNo + ", title=" + title + ", content=" + content + "]";
	}
	
	
}

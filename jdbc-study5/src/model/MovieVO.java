package model;
/*
 *  DTO : Data Transfer Object
 *  VO : Value Object
 */
public class MovieVO {
	private int id;
	private String title;
	private int attendance;
	public MovieVO() {
		super();
	}
	public MovieVO(int id, String title, int attendance) {
		super();
		this.id = id;
		this.title = title;
		this.attendance = attendance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	@Override
	public String toString() {
		return "MovieVO [id=" + id + ", title=" + title + ", attendance=" + attendance + "]";
	}
	
}

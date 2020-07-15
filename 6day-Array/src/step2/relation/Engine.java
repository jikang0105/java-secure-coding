package step2.relation;

public class Engine {
	private String type;
	private String displacement;
	public Engine(String type, String displacement) {
		super();
		this.type = type;
		this.displacement = displacement;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDisplacement() {
		return displacement;
	}
	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}
	
}

package step3;

public class Engineer extends Employee {
	private String skill;
	private int bonus;
	
	public Engineer(String responsibility, String name, int salary, String skill, int bonus) {
		super(responsibility, name, salary);
		this.skill = skill;
		this.bonus = bonus;
	}
	
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public String getSkill() {
		return skill;
	}
	public int getBonus() {
		return bonus;
	}
	public int getAnnualSalary() {
		return (getSalary() + getBonus()) * 12;
	}
	public String toString() {
		return super.toString() +  " / Skill : " + skill;
	}
}

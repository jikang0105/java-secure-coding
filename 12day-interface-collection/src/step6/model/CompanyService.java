package step6.model;

public class CompanyService {
	private int index;
	
	Employee [] array;
	
	public CompanyService(int length){
		array = new Employee[length];
	}
	
	public void add(Employee e) {
		array[index++] = e;
	}
	
	public void printAll() {
		for(int i = 0; i < index; i++) {
			System.out.println(array[i].toString());
		}		
	}
	
	public Employee findById(String empId) {
		for(int i = 0; i<index; i++) {
			if(array[i].getEmpId().equals(empId)) {
				return array[i];				
			}
		}
		return null;
	}

	public void removeById(String empId) {
		for(int i = 0; i<index; i++) {
			if(array[i].getEmpId().equals(empId)) {				
				for(int j = i + 1; j < index; j++) {
					array[i] = array[j];
				}				
				array[index] = null;
				--index;
			}
		}
	}
	
}

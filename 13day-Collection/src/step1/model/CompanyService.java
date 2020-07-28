package step1.model;

public class CompanyService {
	private Employee[] array;
	private int index;
	public CompanyService(int length) {
		array=new Employee[length];
	}
	public void add(Employee e) {
		// 사원객체가 전달될 때마다 배열 요소로 담고 index를 하나씩 증가시킨다 
		array[index++]=e;
	}
	public void printAll() {
		for(int i=0;i<index;i++) {
			System.out.println(array[i]);
		}
	}
	/**
	 * 전달된 사원아이디에 일치되는 사원객체(엔지니어,매니저 포함)를 호출한 곳으로
	 * 반환하는 메서드 
	 * 만약 사원아이디에 일치하는 사원객체가 배열에 존재하지 않는 다면 null을 반환.
	 * @param empId
	 * @return
	 */
	public Employee findById(String empId) {
		Employee emp=null;
		for(int i=0;i<index;i++) { //배열요소가 존재할때까지만 반복하면 된다 
			//전달된 사원번호와 배열요소의 사원번호가 일치하면 
			if(empId.equals(array[i].getEmpId())) {
				emp=array[i];
				break; // 실행문을 벗어난다 
			}
		}
		return emp;
	}
	/**
	 * 사원아이디에 해당하는 요소의 index 위치를 반환하는 메서드 
	 * 만약 일치되는 사원아이디에 해당하는 요소가 배열에 없다면 -1을 반환 
	 * @param empId
	 * @return
	 */
	public int findIndexByEmpId(String empId) {
		int position=-1;
		for(int i=0;i<index;i++) {
			//사원아이디가 배열요소사원아이디와 일치하면
			if(empId.equals(array[i].getEmpId())) {
				position=i;// 배열요소의 위치를 지역변수에 할당한다 
				break;
			}
		}
		return position;
	}
	/**
	 * 매개변수로 전달된 사원아이디와 배열요소의 사원객체의 사원아이디가 일치하면
	 * 해당 배열요소를 삭제하는 메서드 
	 * 1. findIndexByEmpId() 메서드를 이용해 사원아이디에 해당하는 배열요소의
	 *    위치를 반환받는다. 만약 일치하는 사원이 없으면 -1 이 반환된다 
	 * 2. -1 이 반환되면 일치하는 사원이 없습니다 라는 메서지를 출력하고 작업종료 
	 * 3. -1 이 아니면 일치하는 사원이 있으면 해당 사원이 위치한 값을 이용해
	 * 	    그 지점부터 index(사원수) 보다 작을 동안 계속 반복하면서 뒤 요소를 
	 *     앞요소에 할당하는 방식으로 삭제한다 
	 *     3.1 만약 삭제요소가 마지막 요소라면 ( array[i]=array[i+1] -> 불가능 )
	 *          직접 null을 할당한다 
	 * @param empId
	 */
	public void removeById(String empId){
		int position=findIndexByEmpId(empId);//삭제 대상 배열 요소 위치 반환 
		if(position==-1) {//삭제 대상이 없으면 
			System.out.println(empId+" 사원아이디에 해당하는 사원이 없어서 삭제불가!");
		}else {//삭제 대상이 배열에 있으면 삭제한다 
			for(int i=position;i<index;i++) {
				if(i+1==array.length) {//마지막 요소를 삭제할 때는 직접 null 을 할당 
					array[i]=null;
				}else {
					array[i]=array[i+1];
				}
			}//for
			index--; // 삭제 했으므로 index를 1 감소시킨다 
		}//else		
	}//method
}//class




























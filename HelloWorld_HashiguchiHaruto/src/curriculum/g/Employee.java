package curriculum.g;

/**************************************************
* Javaカリキュラム2.22　基礎問題6　Q3　カプセル化
**************************************************/

public class Employee {

	//private
	private String employeeId;
	private String name;
	
	//getter
	public String getEmployeeId() {
		return this.employeeId;
	}
	
	//setter
	public void setEmployeeId( String id ) {
		this.employeeId = id;
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	
	//setter
	public void setName( String name ) {
		this.name = name;
	}
	
}

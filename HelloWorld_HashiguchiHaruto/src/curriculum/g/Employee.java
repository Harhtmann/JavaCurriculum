package curriculum.g;

/**************************************************
* Javaカリキュラム2.22　基礎問題6　Q3　カプセル化
**************************************************/

public class Employee {

	//private
	private String EmployeeId;
	private String Name;
	
	//getter
	public String getEmployeeId() {
		return this.EmployeeId;
	}
	
	//setter
	public void setEmployeeId( String Id ) {
		this.EmployeeId = Id;
	}
	
	//getter
	public String getName() {
		return this.Name;
	}
	
	//setter
	public void setName( String Name ) {
		this.Name = Name;
	}
	
}

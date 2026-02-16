package curriculum.h;

/**************************************************
* Javaカリキュラム2.22　基礎問題6　Q4　継承
**************************************************/

public abstract class Employee {
	//フィールド
	private String employeeId;
	private String name;
	
	//コンストラクタ
	public Employee( String id, String name ) {
		this.employeeId = id;
		this.name = name;
	}
	
	//getメソッド
	public String getEmployeeId() {
		return this.employeeId;
	}
	
	public String getname() {
		return this.name;
	}
	
	//社員の給料の算出
	public abstract int calculateDailyWage( int hoursWorked );
}

package curriculum.i;

/**************************************************
* Javaカリキュラム2.22　基礎問題6　Q5　ポリモーフィズム
**************************************************/

public class ContractEmployee extends Employee {
	//コンストラクト
	public ContractEmployee( String id, String name ) {
		super( id, name );
	}
	
	//契約社員　給料算出
	@Override
	public int calculateDailyWage(int hoursWorked) {
		int hourlyRate = 1000;
		return hoursWorked * hourlyRate;
	}
	
}

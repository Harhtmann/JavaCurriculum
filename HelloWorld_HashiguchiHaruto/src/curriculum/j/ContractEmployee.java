package curriculum.j;

/**************************************************
* Javaカリキュラム2.22　基礎問題6　Q6　インターフェイスと抽象クラス
**************************************************/

public class ContractEmployee extends Employee {
	//コンストラクト
	public ContractEmployee( String id, String name ) {
		super( id, name );
	}
	
	//契約社員　給料算出
	@Override
	public int costForDay(int hoursWorked) {
		int hourlyRate = 1000;
		return hoursWorked * hourlyRate;
	}
}

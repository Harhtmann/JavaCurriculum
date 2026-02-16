package curriculum.j;

/**************************************************
* Javaカリキュラム2.22　基礎問題6　Q6　インターフェイスと抽象クラス
**************************************************/

public class FullTimeEmployee extends Employee {
	//コンストラクト
	public FullTimeEmployee( String id , String name ) {
		super( id , name );
	}
	
	//正社員　給料算出
	@Override
	public int costForDay( int hoursWorked ) {
		int hourlyRate = 1250;
		int overtime = Math.max(0, hoursWorked - 8);
		int regularHours = hoursWorked - overtime;
		return(regularHours * hourlyRate) + (int)(overtime * hourlyRate * 1.25);
	}
	
}

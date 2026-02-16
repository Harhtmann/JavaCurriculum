package curriculum.i;

/**************************************************
* Javaカリキュラム2.22　基礎問題6　Q5　ポリモーフィズム
**************************************************/

public class FullTimeEmployee extends Employee {
	//コンストラクト
	public FullTimeEmployee( String id, String name ) {
		super( id, name );
	}
	
	//正社員　給料算出
	@Override
	public int calculateDailyWage( int hoursWorked ) {
		int hourlyRate = 1250;
		int overtime = Math.max(0, hoursWorked - 8);
		int regularHours = hoursWorked - overtime;
		return(regularHours * hourlyRate) + (int)(overtime * hourlyRate * 1.25);
	}
	
}

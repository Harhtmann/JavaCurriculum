package curriculum.h;

/**************************************************
* Javaカリキュラム2.22　基礎問題6　Q4　継承
**************************************************/

public class PartTimeEmployee extends Employee {
	
	//パート社員 1h \1000
	private static final int HOURLY_RATE = 1000;
	
	//コンストラクタ
	public PartTimeEmployee( String id, String name ) {
		super( id, name );
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		//パート社員給料
		int pWages = HOURLY_RATE * hoursWorked;
		return pWages;
	}

}

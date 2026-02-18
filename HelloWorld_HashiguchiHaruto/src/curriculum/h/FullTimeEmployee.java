package curriculum.h;

/**************************************************
* Javaカリキュラム2.22　基礎問題6　Q4　継承
**************************************************/

public class FullTimeEmployee extends Employee {
	
	//正社員 1h \1200
	private static final int HOURLY_RATE = 1200;
	
	//コンストラクタ
	public FullTimeEmployee( String id, String name ) {
		super( id, name );
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		
		if( hoursWorked <= 8 ) {
			//残業なし
			int noOver = hoursWorked * HOURLY_RATE;
			return noOver;
		}else {
			//超過分
			int overtime = hoursWorked - 8 ;
			//残業ボーナス
			int bonus = (int)(overtime * (HOURLY_RATE * 1.25)) ;
			
			//正社員給料
			int fWages = (HOURLY_RATE * 8) + bonus; 
			return fWages;
		}
	}

}

package curriculum.k;

/**************************************************
* Javaカリキュラム2.22　基礎問題6　Q7　オブジェクト指向尾設計原則(SOLID)
**************************************************/

public class FullTimeSalary extends Employee {
	//コンストラクト
	public FullTimeSalary( String name , String type , int hours ) {
		super( name , type , hours );
	}
	
	//正社員　給料算出
	@Override
	public int costForDay(int hoursWorked) {
		int hourlyRate = 1200;
		return hoursWorked * hourlyRate;
	}
	
	//正社員（fulltime）の名前を設定
	public String eName(String name) {
		return name;
	}
}

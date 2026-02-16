package curriculum.k;

/**************************************************
* Javaカリキュラム2.22　基礎問題6　Q7　オブジェクト指向尾設計原則(SOLID)
**************************************************/

public interface Billables {
	//給料算出
	int costForDay( int hoursWorked );
	
	//従業員名設定用
	String eName( String name );
}
